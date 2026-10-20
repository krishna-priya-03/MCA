class Rectangle:
    def __init__(self, l, b):
        self.length = l
        self.breadth = b

    def area(self):
        return self.length * self.breadth

    def perimeter(self):
        return 2 * (self.length + self.breadth)

    def __lt__(self, second):
        # Compare areas directly
          if self.area() < second.area():
               return True
          else:
               return False

# Input from user
a = int(input("Enter length of rectangle1: "))
b = int(input("Enter breadth of rectangle1: "))
c = int(input("Enter length of rectangle2: "))
d = int(input("Enter breadth of rectangle2: "))

# Create rectangle objects
obj1 = Rectangle(a, b)
obj2 = Rectangle(c, d)

# Display area and perimeter
print("Area of rectangle1:", obj1.area(), "Area of rectangle2:", obj2.area())
print("Perimeter of rectangle1:", obj1.perimeter(), "Perimeter of rectangle2:", obj2.perimeter())

# Compare rectangles
if obj1 < obj2:
    print("Rectangle 1 is smaller than Rectangle 2")
elif obj1== obj2:
    print("Both rectangles have the same area")
else:
    print("Rectangle 1 is larger than Rectangle 2")
