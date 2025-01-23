import math

while True:
    num = input("Enter number or enter 'q' to quit: ")
    if num == 'q' or not num.isnumeric():
        break;

    num = int(num)

    if num <= 1:
        print("The number entered is not a prime.")
        continue

    cond = True
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            print("The number entered is not a prime.")
            cond = False
            break

    if cond:
        print("The number entered is a prime.")
