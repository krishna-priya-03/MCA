import csv
f=open("dark.csv","r")
content=csv.reader(f)
n=int(input("enter the index"))
for i in content:
    print(i[n])
f.close()
