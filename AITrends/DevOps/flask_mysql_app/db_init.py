import mysql.connector

MYSQL_HOST = "localhost"
MYSQL_USER = "root"
MYSQL_PASSWORD = "rootpassword"

conn = mysql.connector.connect(
    host=MYSQL_HOST,
    user=MYSQL_USER,
    password=MYSQL_PASSWORD
)

cur = conn.cursor()

cur.execute("CREATE DATABASE IF NOT EXISTS userdb")
cur.execute("USE userdb")

cur.execute("""
CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    city VARCHAR(100),
    address TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)
""")

cur.execute("""
CREATE USER IF NOT EXISTS 'appuser'@'%' IDENTIFIED BY 'apppassword'
""")

cur.execute("""
GRANT ALL PRIVILEGES ON userdb.* TO 'appuser'@'%'
""")

cur.execute("FLUSH PRIVILEGES")

conn.commit()
cur.close()
conn.close()

print("Database and table created successfully.")
