#write a program to create a class rectangle with attribute
#length and breadth and methods to finds area and perimeter?

class rectangle():
    def __init__(self,l,b):
        self.length=l
        self.breadth=b
    def area(self):
            return self.length*self.breadth
    def perimeter(self):
            return 2*(self.length+self.breadth)
a=int(input("Enter length of rectangle1:"))
b=int(input("Enter breadth of rectangle1:"))
c=int(input("Enter length of rectangle2:"))
d=int(input("Enter breadth of rectangle2:"))
obj1=rectangle(a,b)
obj2=rectangle(c,d)
area1=obj1.area()
area2=obj2.area()
print("Area of rectangle1:",obj1.area(),"Area of rectangle2:",obj2.area())
print("Perimeter of rectangle1:",obj1.perimeter(),"Perimeter of rectangle2:",obj2.perimeter())
#comparison
if area1>area2:
      print("Rectangle 1 is larger")
elif area1<area2:
      print("Rectangle 2 is larger")
else :
    print("Both are equal")
print()
       
