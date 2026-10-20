n = int(input("Enter the number of steps for the pyramid:"))
for i in range(1,n+1):
    row = [i *j for j in range(1,i+1)]
    print(" ".join(map(str,row)))
