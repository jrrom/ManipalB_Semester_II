import sys

n1 = int(input("Enter first: "))
n2 = int(input("Enter second: "))

if n1 > n2:
    print("Error: starting of range cannot be higher than ending value")
    sys.exit()

for i in range(n1, n2):
    if i == 0:
        print(i, "is zero")
    elif i % 2 == 0:
        print(i, "is even")
    else:
        print(i, "is odd")

