# First
rows = int(input("Enter rows: "))

for i in range(1, rows + 1):
    if i > (rows / 2):
        print(" " * (i - 1), end="")
        print("o " * (rows + 1 - i), end="")
    else:
        print(" " * (rows - i), end="")
        print("o " * i, end="")

    print()

# Enter rows: 5
#     o 
#    o o 
#   o o o 
#    o o 
#     o 

# Second
rows = int(input("Enter rows: "))

for i in range(1, rows + 1):
    for j in range(1, i + 1):
        print(j, end=" ")
    print()

# Enter rows: 5
# 1 
# 1 2 
# 1 2 3 
# 1 2 3 4 
# 1 2 3 4 5 

# Third
rows = int(input("Enter rows: "))
count = 1

for i in range(1, rows + 1):
    for j in range(1, i + 1):
        print(count, end="\t")
        count += 1
    print()

# Enter rows: 4
# 1	
# 2	3	
# 4	5	6	
# 7	8	9	10	
