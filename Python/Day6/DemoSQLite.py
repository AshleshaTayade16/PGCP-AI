import sqlite3
from sqlite3 import Error

def connect_db(path):
    con = None
    try:
        com = sqlite3.connect(path)
        print('connection successful')
        return con
    except Error as e:
        print(e)

def execute_query(con,query):
    try:
        cursor = con.cursor()
        cursor.execute(query)
        con.commit()
        print('Query successful')
    except Error as e:
        print(e)

def execute_read_query(con,query):
    try:
        cursor = con.cuesor()
        cursor.execute(query)
        results=cursor.fetchall()
        return results
    except Error as e:
        print(e)

def close_connection(con):
    try:
        if con:
            con.close()
    except Error as e:
        print(e)

#create_table =

add_users ="""
INSERT INTO
    user (name,age,gender,nationality )
VALUES
    ('James',25,'male','USA')
    ('leila',32,'female','france')
    ('Ruchika',27,'female','INDIA')
    ('Sanjay',30,'male','canada')
    
"""
update_user="""
UPDATE
    user
SET
    age =22
WHERE
    name ='Ruchika'
"""

delete_user ="""
DELETE from user WHERE id =5"""

path = "D:\\AshleshaRuchika\\PGCP-AI\\Python\\Day6"
connection = connect_db(path)
records = execute_read_query(connection,fetch_users)
for record in records:
    print(record)