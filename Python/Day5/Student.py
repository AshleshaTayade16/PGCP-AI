'''Q1.Create a class 'Student' with rollno, studentName, dictionary/list of
marks(subjectName->marks[3])
marks[3]
Provide following functionalities
A.initializer(__init__)
B.implement __str__ method
C.Print student data for given id
D Calculate GPA()
    gpa=(1/3)*m1+(1/2)*m2+(1/4)*m3

Create 5 student object and store them in list
for student data stored in the list perform following operation:
1.Display all student
2.Search by id
3.Sort by name
4.Calculate GPA of a student'''

class Student:

    #initializer(__init__)
    def __init__(self,rollno,studentName,marks):
        self.rollno=rollno
        self.studentName=studentName
        self.marks=marks

    #implement __str__ method
    def __str__(self):
        return f"{self.rollno}: {self.studentName} {self.marks}"

    #Calculate GPA()
    def gpa(self):
        gpa = (1 / 3) * self.marks['Maths'] + (1 / 2) * self.marks['Science'] + (1 / 4) * self.marks['English']
        return gpa


s1= Student(11,'Ashlesha', {'Maths':60,'Science': 88,'English': 92})
s2= Student(12,'Ruchika', {'Maths':77,'Science': 87,'English': 86})
s3= Student(13,'Payal', {'Maths':56,'Science': 78,'English': 94})
s4= Student(14,'Ajay', {'Maths':50,'Science': 79,'English': 70})
s5= Student(15,'Pranita', {'Maths':85,'Science': 88,'English': 72})
# print(s1.get_student_by_id())
student=[s1,s2,s3,s4,s5]

print(f"{'RollNo':<10}{'Name':<19}{'Marks':<12}{'GPA'}")
for s in student:
    print(f"{s.rollno:<10}{s.studentName:<14}{s.marks['Maths']:<4} {s.marks['Science']:<4} {s.marks['English']:<6}{round(s.gpa(),2)}")

print(end='\n')
n=int(input('Enter student rollno: '))

for s in student:
    if s.rollno==n:
        print(f"{s.rollno:<10}{s.studentName:<14}{s.marks['Maths']:<4} {s.marks['Science']:<4} {s.marks['English']:<6}{round(s.gpa(), 2)}")

print(end='\n')
#Sort by name
print("Sorted Data")
sorted_data = sorted(student, key=lambda s: s.studentName)

for s in sorted_data:
    print(f"{s.rollno:<10}{s.studentName:<14}{s.marks['Maths']:<4} {s.marks['Science']:<4} {s.marks['English']:<6}{round(s.gpa(),2)}")





