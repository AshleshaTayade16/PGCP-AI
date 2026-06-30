#SL Assignment-1
#Name: Ashlesha Tayade
#PRN:260240128008

#Name: Ruchika Gaikwad
#PRN: 260240128036

#Entrypoint 2.x
from pyspark.sql import SparkSession
spark = SparkSession.builder.appName("Spark SQL basic example").enableHiveSupport().getOrCreate()

# On yarn:
# spark = SparkSession.builder.appName("Spark SQL basic example").enableHiveSupport().master("yarn").getOrCreate()
# specify .master("yarn")

sc = spark.sparkContext

from pyspark.sql import SparkSession
from pyspark.sql.types import StructType, StructField, StringType, DateType, DoubleType, LongType

# Initialize Spark Session
spark = SparkSession.builder.appName("StockSchema").getOrCreate()

# Define the explicit schema matching your image data
stock_schema = StructType([
    StructField("exchange", StringType(), True),
    StructField("script", StringType(), True),
    StructField("price_date", DateType(), True),
    StructField("open", DoubleType(), True),
    StructField("high", DoubleType(), True),
    StructField("low", DoubleType(), True),
    StructField("close", DoubleType(), True),
    StructField("volume", LongType(), True),
    StructField("adj_close", DoubleType(), True)
])

file_path = "file:///home/talentum/test-jupyter/Assignment/NYSE_daily_prices_A.csv"

df = spark.read.format('csv').load(file_path, schema=stock_schema)
df.show()

moneyFlow = df.withColumn("typical_price", (df["high"] + df["low"] + df["close"]) / 3)
moneyFlow.show()

moneyFlow = moneyFlow.withColumn("money_flow", moneyFlow["typical_price"] * moneyFlow["volume"])
moneyFlow.show()

moneyFlow.select("exchange", "script", "price_date", "money_flow").show()


