#!usr/bin/python

#Chirayu - 260240128011
#Devendra - 260240128012

#Entrypoint 2.x
from pyspark.sql import SparkSession
spark = SparkSession.builder.appName("Spark SQL basic example").enableHiveSupport().getOrCreate()

# On yarn:
# spark = SparkSession.builder.appName("Spark SQL basic example").enableHiveSupport().master("yarn").getOrCreate()
# specify .master("yarn")

sc = spark.sparkContext


#1.a load the file 
split_RDD = sc.textFile('file:///home/talentum/test-jupyter/P2/m2/sm4/Pair-RDD/selfishgiant.txt')\
.flatMap(lambda line: line.split(' '))
print(split_RDD.take(5))

#1.b RDD Mapping
mappedRDD = split_RDD.map(lambda word: (word,1))
print(mappedRDD.take(5))