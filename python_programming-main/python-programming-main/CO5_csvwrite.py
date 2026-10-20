import csv
f=open("AJP1.csv","a",newline="")
content=csv.writer(f)
for i in range(3):
    Name=input("Enter the name")
    Age=int(input("Enter the age"))
    Mark=float(input("Enter the mark"))
    l=[Name,Age,Mark]
    content.writerow(l)
f.close()
f=open("AJP1.csv","r")
content=csv.reader(f)
next(content)
for i in content:
    print(i)

    
