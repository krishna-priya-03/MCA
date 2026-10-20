
f=open("dark.txt","r")
fodd=open("oddfile.txt","w")
feven=open("evenfile.txt","w")
content=f.readlines()
n=len(content)
for i in range(n):
    if i % 2 == 1:
        feven.write(content[i])
    else:
        fodd.write(content[i])
f.close()
feven.close()
fodd.close()
