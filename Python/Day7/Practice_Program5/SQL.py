import sqlite3
from sqlite3 import Error

#connect database
conn = sqlite3.connect("books.db")
cur = conn.cursor()
#create table
cur.execute("create table if not exists Book(isbn int primary key, title text, author text, price int)")

#Insert new book data
def insert_book():
    try:
        isbn = int(input("Enter ISBN: "))
        title = input("Enter Title: ")
        author = input("Enter Author: ")
        price = int(input("Enter Price: "))
        cur.execute("insert into Book values(?,?,?,?)", (isbn, title, author, price))
        conn.commit()
        print("Book inserted successfully")
    except Error as e:
        print("Error:", e)

# 2.Display data for all books
def display_books():
    try:
        cur.execute("select * from Book")
        data = cur.fetchall()
        for row in data:
            print(row)
    except Error as e:
        print("Error:", e)

# 3.Update price for a book
def update_price():
    try:
        isbn = int(input("Enter ISBN to update: "))
        price = int(input("Enter new price: "))
        cur.execute("update Book set price=? where isbn=?", (price, isbn))
        conn.commit()
        print("Price updated")
    except Error as e:
        print("Error:", e)

#4.delete data for a book
def delete_book():
    try:
        isbn = int(input("Enter ISBN to delete: "))

        cur.execute("delete from Book where isbn=?", (isbn,))
        conn.commit()
        print("Book deleted")

    except Error as e:
        print("Error:", e)

#5.Display books with price >500
def expensive_books():
    try:
        cur.execute("select * from Book where price > 500")
        data = cur.fetchall()
        for row in data:
            print(row)
    except Error as e:
        print("Error:", e)

#menu
while True:
    print("\n1.Insert Book")
    print("2.Display All Books Data")
    print("3.Update Price for a book")
    print("4.Delete Books data")
    print("5.Display Books Price > 500")
    print("6.Exit")

    ch = int(input("Enter choice: "))

    if ch == 1:
        insert_book()
    elif ch == 2:
        display_books()
    elif ch == 3:
        update_price()
    elif ch == 4:
        delete_book()
    elif ch == 5:
        expensive_books()
    elif ch == 6:
        break
    else:
        print("Invalid choice")

conn.close()