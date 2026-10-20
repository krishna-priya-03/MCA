#generate positive list of numbers from a given list of integers?

n=int(input("Enter the limit"))
list=[]
for i in range(n):
    a= int(input("Enter the number:"))
    if (a > 0  ):
        list.append(a)
print(list)
          
