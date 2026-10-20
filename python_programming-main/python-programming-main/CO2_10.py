def find_factors(number):
    """
    Finds all factors of a given positive integer.
    """
    factors = []
    for i in range(1, number + 1):
        if number % i == 0:
            factors.append(i)
    return factors
num = int(input("Enter a number: "))
if num <= 0:
    print("Please enter a positive integer.")
else:
    result_factors = find_factors(num)
    print(f"The factors of {num} are: {result_factors}")
