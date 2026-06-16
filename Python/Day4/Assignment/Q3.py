# Q.3. Function display_greeting(message) prints message sent as argument
# as today's greeting. Decorate the function using appropriate decorated so
# that the greeting is displayed using Uppercase.

greet=input('Enter the greet: ')

def uppercase(func):
  def inner(msg):
    return func(msg).upper()
  return inner

@uppercase
def display_greeting(greet):
  return greet

print(display_greeting(greet))