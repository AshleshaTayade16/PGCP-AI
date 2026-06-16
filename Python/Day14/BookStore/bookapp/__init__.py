from flask import Flask
from flask_sqlalchemy import SQLAlchemy


app=Flask(__name__)
app.config["SQLALCHEMY_DATABASE_URI"]='sqlite:///books.db'
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False
app.config['SECRET_KEY']='73f66facae9cea882d49a9049747090f'

db=SQLAlchemy(app)

from . import views
from . import models