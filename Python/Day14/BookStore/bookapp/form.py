from flask_wtf import  FlaskForm
from wtforms import StringField, SubmitField, EmailField,PasswordField,SubmitField
from wtforms.validators import DataRequired, Length, Email, EqualTo

class RegistrationForm(FlaskForm):
    username=StringField('Username',validators=[DataRequired(),Length(min=2,max=30)])
    email = EmailField('Email', validators=[DataRequired(), Email()])
    password = PasswordField('Password', validators=[DataRequired()])
    confirm_password=PasswordField('Confirm Password',validators=[DataRequired(),EqualTo('password')])
    submit=SubmitField('Register')

