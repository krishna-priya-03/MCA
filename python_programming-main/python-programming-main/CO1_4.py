string = input("Enter a string:")
counts = dict()
words = string.split()
print(words)
for i in words:
    if i in counts:
        counts[i]+=1
    else:
        counts[i]=1
print(counts)
for  i in counts:
    print(i)
