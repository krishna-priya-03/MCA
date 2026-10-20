n=[-5 , 3 , 0 , 8 , -2 , 7 , -1]
pn=[i for i in n  if i > 0]
print(pn)

s=int(input("Enter the number :"))
sq=[i * i for i in range(1,s+1)]
print(sq)

w=input("Enter the word:")
v=[i for i in w if i.lower() in "aeiou"]
print(v)

t=input("Enter a word:")
ov=[ord(i) for i in t]
print(ov)
