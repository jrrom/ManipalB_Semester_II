# Sum, Average, Largest and Smallest
n = int(input("Enter number of elements: "))
arr = [int(input("Enter: ")) for _ in range(n)]
oc = int(input("Enter number to find occurance: "))

print("Largest is", max(arr))
print("Smallest is", min(arr))
print("Sum is", sum(arr))
print("Average is", sum(arr) / len(arr))
print("Occurance of", oc, "is", arr.count(oc))
