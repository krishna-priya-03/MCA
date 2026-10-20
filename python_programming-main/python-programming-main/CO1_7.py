#Enter two list of integers i) check whether the two list have same length j)whether list sums to same value k)whether any value occur in both?

n1 = int(input("Enter the limit:"))
li1= []
for i in range(n1):
    num = int(input("Enter the elements of first list:"))
    li1.append(num)
    
n2 = int(input("Enter the limit:"))
li2= []
for i in range(n2):
    num = int(input("Enter the elements of second list:"))
    li2.append(num)
    
c=0
if len(li1)== len(li2):
    print("list 1 and list 2 are of same length")
else:
    print("list 1 and list 2 are not of same length")

if sum(li1) == sum(li2):
     print("list 1 and list 2 have same sum value")
else:
    print("list 1 and list 2 do not have same sum value")

status = False
for i in li1:
    if i in li2:
        status=True
        c=c+1

if status == True:
    print("common values",c)

        
            
    
