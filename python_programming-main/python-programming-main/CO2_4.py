#GENERATE A LIST OF 4 DIGIT NUMBERS WITH ALL THEIR DIGITS EVEN AND THE NUMBER IS A PERFECT SQUARE?

import math
for i in range(1000,10000):
    squareroot=int (math.sqrt(i))
    if (squareroot * squareroot == i):
        if all(int(digit) % 2 == 0
            for digit in str(i)):
                print(i)
