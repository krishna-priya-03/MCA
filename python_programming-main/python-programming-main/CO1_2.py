#display future leap year from current year to final year(without automatical year)?


cy=int(input("Enter the year;"))
fy=int(input("Enter the year;"))
for i in range(cy,fy+1):
    if(i%4==0 and i%4!=100 or i%400==0):
        print(i)


    
