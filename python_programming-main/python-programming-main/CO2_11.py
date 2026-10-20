#write a program to find area of rectangle ,square ,and triangle using lambda function?

area_square=lambda side : side*side
area_rectangle=lambda length,width : length*width
area_triangle=lambda s,a,b,c : (s*(s-a)*(s-b)*(s-c))**0.5
a=int(input("Enter value of a"))
b=int(input("Enter value of b"))
c=int(input("Enter value of c"))
s=(a+b+c)/2
print("area of square",area_square(a))
print("area of rectangle",area_rectangle(a,b))
print("area of triangle",area_triangle(s,a,b,c))

