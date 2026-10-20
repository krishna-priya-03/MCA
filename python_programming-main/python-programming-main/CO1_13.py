f=open("dark.txt","r")
content=f.readlines()
n=len(content)
for i in range(n):
    if i % 2 == 1:
       print(content[i])
