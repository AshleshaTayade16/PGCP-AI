#!/usr/bin/python

# Demo - Watermarking Part 1

# Before running this streaming application
# Run following command on a new terminal window to open the socket
# nc -lk 9999
#
# Note: Make sure you have the socket open before you start the streaming application.
#

# Import Libraries
from pyspark.sql import SparkSession
import pyspark.sql.functions as F

# Create Spark Session
spark = SparkSession\
.builder\
.master("local")\
.appName("Socket Source")\
.getOrCreate()

# Get the logger and set the log level
spark.sparkContext.setLogLevel("WARN")

# Define host and port number to Listen.
host = "127.0.0.1"
port = "9999"

# Create Streaming DataFrame by reading data from socket.
initDF = spark\
.readStream\
.format("socket")\
.option("host", host)\
.option("port", port)\
.load()

# Print Schema of initDF
print("Schema of DataFame initDF.")
print(initDF.printSchema())

# Check if DataFrame is streaming or Not.
print("Streaming DataFrame : {} ".format(initDF.isStreaming))
print(initDF.printSchema())

# Perform word count on streaming DataFrame
event_DF = initDF\
.select(F.split(F.col("value"), "#").alias("data"))\
.withColumn("event_timestamp", F.element_at(F.col("data"),1).cast("timestamp"))\
.withColumn("val", F.element_at(F.col("data"),2).cast("int"))\
.drop(F.col("data"))

# Print Schema of DataFrame
print("Schema of DataFame event_DF.")
print(event_DF.printSchema())

result_DF = event_DF\
.groupBy(F.window(F.col("event_timestamp"), "5 minutes"))\
.agg(F.sum("val").alias("sum"))

# Print Schema of DataFrame
print("Schema of DataFame result_DF.")
print(result_DF.printSchema())

# Try "update" and "complete" mode.
result_DF\
.writeStream\
.outputMode("update")\
.option("truncate", False)\
.format("console")\
.start()\
.awaitTermination()


