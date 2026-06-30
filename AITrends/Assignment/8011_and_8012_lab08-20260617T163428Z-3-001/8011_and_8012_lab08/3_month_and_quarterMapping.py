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

#1.a Creating months data
months =("Jan", "Feb", "Mar", "Apr", "May","Jun","Jul")
monthsRdd = sc.parallelize(months)
monthsIndexed0Rdd = monthsRdd.zipWithIndex()
print(monthsIndexed0Rdd.collect())

#1.b Indexing months with map
monthsIndexed1Rdd = monthsIndexed0Rdd.map(lambda x : (x[0],x[1]+1))
print(monthsIndexed1Rdd.collect())

#1.c Indexing month with mapValues
monthsIndexed2RDD  = monthsIndexed0Rdd.mapValues(lambda y:y+1)
print(monthsIndexed2RDD.collect())

#1.d Quarters for months
quarters = (1,1,1,2,2,2,3)
quartersRDD = sc.parallelize(quarters)
monthsZipQuarter = monthsRdd.zip(quartersRDD)
print(monthsZipQuarter.collect())

#1.e collecting and sorting the data
print(monthsZipQuarter.keys().collect())
print(monthsZipQuarter.values().collect())
print(monthsZipQuarter.sortByKey().collect())