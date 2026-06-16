from django.shortcuts import render, get_object_or_404, redirect
from .models import Book
from django.contrib.auth.forms import UserCreationForm
# Create your views here.
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
def home(request):
    context ={'books':Book.objects.all()}
    return render(request,'bookapp/home.html',context=context)

def about(request):
    return render(request,'bookapp/about.html',{'title':'about'})

def book_details(request,book_id):
    book=get_object_or_404(Book, id=book_id)
    return render(request, 'bookapp/book_details.html', context={'book':book})


def register(request):
    if request.method == 'POST':
        form = UserCreationForm(request.POST)
        if form.is_valid():
            # Process data here (e.g., save to database)
            form.save()
        return redirect('bookapp-home')
    else:
        form = UserCreationForm()
        return render(request, 'bookapp/register.html', {'title':'Register','form': form})
