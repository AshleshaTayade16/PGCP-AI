booklist =[['Java 8', 700], ['Python for Beginners', 500],
           ['JavaScript', 1000], ['C++', 600],
           ['C Programming', 550], ['.Net', 800]]
print('Books List: ',booklist)

#Add a new book with price
booklist.append(['HTML',400])
print('New book added: ',booklist)

#Remove entry for a book
booklist.remove(['C Programming', 550])
print('Book entry is removed from list: ',booklist)

#Update price for a book
booklist[1][1]=800
print('Updated price: ',booklist)

def get_price(book):
    return book[1]

#Sort the list by book names
booklist.sort(key=str)
print('Sorted by book name: ',booklist)

#Sort the list by prices
booklist.sort(key=get_price)
print('Sorted by book price: ',booklist)

#Print the book with max and min price
max_book=max(booklist,key=get_price)
print('Maximum price: ',max_book)

min_book=min(booklist,key=get_price)
print('Minimum price: ',min_book)
