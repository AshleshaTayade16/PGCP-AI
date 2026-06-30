#! usr/bin/python
# Self Learning Assignment 2
#Name: Ashlesha Tayade
#PRN: 260240128008
#Name: Ruchika Gaikwad
#PRN: 260240128036


from pyspark.sql import SparkSession
from pyspark.sql.functions import udf, col
from pyspark.sql.types import DoubleType

# 1. Initialize SparkSession
spark = SparkSession.builder \
    .appName("NYSE Money Flow Calculation") \
    .getOrCreate()

# 2. Define the schema based on the dataset description
# (Using DoubleType for prices to maintain precision during math operations)
from pyspark.sql.types import StructType, StructField, StringType, IntegerType

schema = StructType([
    StructField("exchange", StringType(), True),
    StructField("stock_symbol", StringType(), True),
    StructField("date", StringType(), True),
    StructField("open", DoubleType(), True),
    StructField("high", DoubleType(), True),
    StructField("low", DoubleType(), True),
    StructField("close", DoubleType(), True),
    StructField("volume", IntegerType(), True),
    StructField("adj_close", DoubleType(), True)
])

# 3. Load the dataset (Replace path with your actual file location)
df = spark.read.csv("NYSE_daily_prices_A.csv", 
                    header=False, 
                    schema=schema)

# 4. Define the Python function for Money Flow
def calculate_money_flow(high, low, close, volume):
    if high is None or low is None or close is None or volume is None:
        return 0.0
    typical_price = (high + low + close) / 3.0
    money_flow = typical_price * volume
    return float(money_flow)

# 5. Register the function as a PySpark UDF
moneyflow_udf = udf(calculate_money_flow, DoubleType())

# 6. Apply the UDF and select required columns
output_df = df.withColumn(
    "money_flow", 
    moneyflow_udf(col("high"), col("low"), col("close"), col("volume"))
).select(
    col("exchange").alias("Exchange Name"),
    col("stock_symbol").alias("Listed company Name"),
    col("date").alias("Recorded date"),
    col("money_flow").alias("Computed money flow")
)

# 7. Display the result
print(df.display())

# Optional: Save the output to a CSV file/directory
# output_df.write.csv("NYSE_money_flow_output", header=True)

# 8. Stop the Spark Session
spark.stop()

