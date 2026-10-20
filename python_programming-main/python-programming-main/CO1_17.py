my_dict={}
n=int(input("Enter the limit"))
for i in range(n):
    key=input("enter keys")
    value=input("Enter values")
    my_dict[key]=value
asc=dict(sorted(my_dict.items()))
print(asc)
des=dict(sorted(my_dict.items(),reverse=True))
print(des)
