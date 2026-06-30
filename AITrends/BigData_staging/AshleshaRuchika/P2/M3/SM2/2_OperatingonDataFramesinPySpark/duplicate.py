#Entrypoint 2.x
from pyspark.sql import SparkSession
spark = SparkSession.builder.appName("Spark SQL basic example").enableHiveSupport().getOrCreate()

# On yarn:
# spark = SparkSession.builder.appName("Spark SQL basic example").enableHiveSupport().master("yarn").getOrCreate()
# specify .master("yarn")

sc = spark.sparkContext

file_path = "file:///home/talentum/test-jupyter/P2/M3/SM2/2_OperatingonDataFramesinPySpark/Dataset/people.csv"

# Create an DataFrame from file_path
people_df = spark.read.csv(file_path, header=True, inferSchema=True)

# Select name, sex and date of birth columns
people_df_sub = people_df.select('name',"sex","date of birth" )

# Print the first 10 observations from people_df_sub
people_df_sub.show(10)

people_df_dup=people_df_sub.groupby('name', 'sex','date of birth').count()
people_df_dup=people_df_dup.filter(people_df_dup["count"] > 1)
people_df_dup.show()
