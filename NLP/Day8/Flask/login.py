from flask import Flask,redirect,url_for,request

app = Flask(__name__)

@app.route("/login", methods=['get','post'])
def hello_user():
    if request.form['nm'] == 'admin':
        return redirect(url_for('hello_admin',user='Admin'))
    else:
        return "Login Unsuccessful!"
    
@app.route('/success/<user>')
def hello_admin(user):
    return "Welcome %s!" %user
    

if __name__ == "__main__":
    app.run(debug=True)