import mysql.connector as mysql
from mysql.connector import Error


def connect_db(username,password,dbname,host ='localhost',port =3306):

    con = None
    try:
        con = mysql.connect(user = username,
                            password = password,
                            database = dbname,
                            host = host,
                            port =port)
        print('connection successful')
        return con

