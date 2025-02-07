n1 = int(input("Enter number of elements in set 1: "))
set1 = { int(input("Enter: ")) for x in range(n1) }
n2 = int(input("Enter number of elements in set 2: "))
set2 = { int(input("Enter: ")) for x in range(n2) }

print("Union is", set1 & set2)
print("Intersection is", set1 | set2)
print("Difference is", set1 - set2)
