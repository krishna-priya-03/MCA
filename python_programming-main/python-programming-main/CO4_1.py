#create a base class student with attributes student name , age and a derived class sem1 (mark ) and derive another class result (grade ) and display all the details using method overriding?

class student:
    def __init__(self,student_name,student_age):
        self.student_name=name
        self.student_age=age
    def display(self):
        print("Student name:",self.student_name)
        print("Student age:",self.student_age)
class sem1(student):
    def mark(self,student_name,student_age,student_mark):
        super().__init__(name,age)
        self.student_mark=mark
    def display(self):
        print("Student mark:",self.student_mark)
class result(sem1):
    def grade(self,student_name,student_age,student_mark,student_grade)
    super().__init__(
