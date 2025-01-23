import cmath

def solve(a, b, c):
    d = b ** 2 - 4 * a * c
    r1 = (-b + cmath.sqrt(d)) / (2 * a)
    r2 = (-b - cmath.sqrt(d)) / (2 * a)
    return r1, r2

def parse(sentence: str):
    # Clean up the sentence
    sentence = sentence.replace("-", "+-").replace(" ", "").replace("x^2", "").replace("x", "").split('+')
    # or 0 is basically Falsy check
    a = int(sentence[0]) or 0
    b = int(sentence[1]) or 0
    c = int(sentence[2]) or 0
    return a, b, c
    
sentence = input("Enter a quadratic equation in the from ax2 + bx + c:\n")
a, b, c = parse(sentence)
print("The inputs are", a, b, c)
print("The solution is", solve(a, b, c))

