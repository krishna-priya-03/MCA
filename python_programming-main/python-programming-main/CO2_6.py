#count the number of characters in a string?

string = input("Enter a string:")
dict={}
for i in string:
    if i in dict:
        dict[i]+=1
    else:
        dict[i]=1
print(dict)
for k,v in dict.items():
    print(k,"=",v)
    
        
    
























               
#counts = dict()
#words = string.split()
#print(words)
#for i in words:
#    if i in counts:
#      counts[i]+=1
#else:
#        counts[i]=1
#print(counts)
#for  i in counts:
#    print(i)
    
