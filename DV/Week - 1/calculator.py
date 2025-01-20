while True:
    ch = input("Enter '+' to add, '-' to subtract, '*' to multiply or '/' to divide. You can type q to exit: ")
    if ch == 'q':
        break;

    num1 = int(input("Enter first number: "))
    num2 = int(input("Enter second number: "))

    if ch == '+':
        print(num1, "+", num2, "=", num1 + num2)
    elif ch == '-':
        print(num1, "-", num2, "=", num1 - num2)
    elif ch == '*':
        print(num1, "*", num2, "=", num1 * num2)
    elif ch == '/':
        print(num1, "/", num2, "=", num1 / num2)
    else:
        print("Error: Invalid operation.")
    print()
