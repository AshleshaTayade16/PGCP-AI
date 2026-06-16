from . import app
from flask import render_template, redirect, url_for
from .models import Book
from .form import RegistrationForm
#
# books = [
#     {
#         'title':'python 3',
#         'author':'abc',
#         'price':400
#     },
#     {
#         'title':'java',
#         'author':'xyz',
#         'price':600
#     },
#     {
#         'title':'java script',
#         'author':'qrd',
#         'price':700
#     }
#
# ]
@app.route ("/")
def home():
    all_books = Book.query.all()
    return (render_template('home.html',books=all_books,title = 'Home'))

@app.route("/aboutus")
def about():
    return (render_template('about.html',title='MyBooks'))

@app.route('/book/<int:book_id>')
def book_details(book_id):
    book=Book.query.get_or_404(book_id)
    return (render_template('book_details.html', book=book))

@app.route('/register',methods=['GET','POST'])
def register():
    form=RegistrationForm()
    if form.validate_on_submit():
        return redirect(url_for('home'))
    else:
        print(form.errors)
    return (render_template('register.html',form=form,title='Register'))