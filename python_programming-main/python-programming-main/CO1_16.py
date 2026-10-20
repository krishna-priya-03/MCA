w1 = input("Enter first word:")
w2 = input("Enter second word:")
n1 = ''.join([w2[1] if i == 1 else w1[i] for i in range(len(w1))])
n2 = ''.join([w1[1] if i == 1 else w2[i] for i in range(len(w2))])
result = n1 + " " + n2
print(result)
