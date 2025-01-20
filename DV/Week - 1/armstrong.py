while True:
    num = input("Enter number or enter 'q' to quit: ")
    if num == 'q' or not num.isnumeric:
        break;

    sum = 0
    for digit in num:
        sum += pow(int(digit), 3)

    if int(num) == sum:
        print("The number", num, "is an Armstrong Number.\n")
