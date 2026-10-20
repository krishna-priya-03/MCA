#prompt the user for a list of integers .For all values greater than 100 store 'over' instead of that number.

n=int(input("Enter the limit"))
list=[]
for i in range(n):
    a= int(input("Enter the number:"))
    if (a > 100 ):
        list.append("over")
    else:
        list.append(a)
print(list)
          
    
