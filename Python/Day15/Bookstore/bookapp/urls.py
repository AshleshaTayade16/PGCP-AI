from django.urls import path, include
from . import views

urlpatterns = [
    path('', views.home,name='bookapp-home'),
    path('bookdetails/<int:book_id>/', views.book_details,name='bookapp-bookdetails'),
    path('about/', views.about,name='bookapp-about'),
    path('register/', views.register,name='bookapp-register'),
]
