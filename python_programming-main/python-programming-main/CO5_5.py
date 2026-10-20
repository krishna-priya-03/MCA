import csv

# Step 1: Take dictionary input from the user
data = {}

n = int(input("How many key-value pairs do you want to enter? "))

for i in range(n):
    key = input(f"Enter key {i+1}: ")
    value = input(f"Enter value for '{key}': ")
    data[key] = value

# Step 2: Write dictionary to CSV
file=open("user_dict.csv", "w", newline='')
writer = csv.writer(file)
writer.writerow(data.keys())     # Header row
writer.writerow(data.values())   # Values row
file.close()

print("\nDictionary written to user_dict.csv successfully.")

# Step 3: Read the CSV file and display its content
print("\nReading from CSV:")

file=open("user_dict.csv", "r")
reader = csv.reader(file)
for row in reader:
    print(row)
file.close()
