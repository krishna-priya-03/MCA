n = int(input("enter the list"))
list=[]
sum = 0
for i in range (n):
    elements = int(input("enter the elements"))
    list.append(elements)
    sum=elements + i
print(list)
print(sum)
