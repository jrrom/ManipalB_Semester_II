import numpy as np
a = np.random.randint(1, 50, (3, 4))

print("Array is: \n", a)
print("Mean is: ", np.mean(a))
print("Median is: ", np.median(a))
print("Standard deviation is: ", np.std(a))
print("Sum of all elements is: ", np.sum(a))
print("Sum of each row is: ", np.sum(a, 1))
a = np.reshape(a, (2, 6))
print("Reshaped array is: \n", a)
