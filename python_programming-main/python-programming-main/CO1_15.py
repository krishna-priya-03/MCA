n1=int(input("Enter limit"))
cl1=[]
for i in range(n1):
    el1=input("Enter colours")
    cl1.append(el1)
n2=int(input("Enter limit"))
cl2=[]
for i in range(n2):
    el2=input("Enter colours")
    cl2.append(el2)
for i in cl1:
    if i not in cl2:
        print(i)
