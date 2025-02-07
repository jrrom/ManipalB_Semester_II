import numpy as np

a = np.random.randint(1, 10, (3, 3))
b = np.random.randint(1, 10, (3, 3))

print("First matrix: \n", a)
print("Second matrix: \n", b)

print("Matrix addition: \n", a + b)
print("Matrix subtraction: \n", a - b)
print("Matrix multiplication: \n", a * b)
print("Dot product: \n", np.dot(a, b))

 print("Transpose of first matrix is: \n", a.T)
print("Transpose of second matrix is: \n", b.T)

det_a = np.linalg.det(a)
print("Determinant of first matrix is: \n", np.linalg.det(a))

det_b = np.linalg.det(b)
print("Determinant of second matrix is: \n", np.linalg.det(b))

if det_a != 0:
    print("Inverse of first matrix is: \n", np.linalg.inv(a))

if det_b != 0:
    print("Inverse of second matrix is: \n", np.linalg.inv(b))
