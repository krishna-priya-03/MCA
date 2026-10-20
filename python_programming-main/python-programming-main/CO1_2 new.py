#display future leap year from current year to final year(with automatical year)?


from datetime import date
cy = date.today().year
fy = int(input("Enter the final year: "))
print(f"Leap years from ",cy," to" ,fy)
for year in range(cy, fy + 1):
    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        print(year)
