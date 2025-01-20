import cmath

def solve(a, b, c):
    d = b ** 2 - 4 * a * c
    r1 = (-b + cmath.sqrt(d)) / (2 * a)
    r2 = (-b - cmath.sqrt(d)) / (2 * a)
    return r1, r2

def parse(sentence):
    a = 0
    b = 0
    c = 0
    
    # Clean up the sentence
    sentence = sentence.replace(" ", "").lower()
    
    # Extract coefficient of x2
    if 'x2' in sentence:
        parts = sentence.split('x2')
        part1 = parts[0]
        a = int(part1) if part1 not in ('', '+', '-') else int(part1 + '1')
        sentence = parts[1]
    
    # Extract coefficient of x
    if 'x' in sentence:
        parts = sentence.split('x')
        part2 = parts[0]
        b = int(part2) if part2 not in ('', '+', '-') else int(part2 + '1')
        sentence = parts[1]
    
    # The remaining part is the constant term
    c = int(sentence) if sentence else 0

    return a, b, c

sentence = input("Enter a quadratic equation in the from ax2 + bx + c:\n")
a, b, c = parse(sentence)
print("The inputs are", a, b, c)
print("The solution is", solve(a, b, c))

