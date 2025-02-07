tup = (1, 2, 3, 4, 5)

try:
    tup[0] = 5
except TypeError as e:
    print("We cannot add or change the value of a tuple since it is
          immutable.")
