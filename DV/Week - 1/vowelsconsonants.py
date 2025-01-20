# To count the number of vowels and consonants in a sentence
sentence = input("Enter a sentence: \n")
consonants = 0
vowels = 0
symbols = 0

frequency = {
    'a': 0,
    'e': 0,
    'i': 0,
    'o': 0,
    'u': 0
}

for i in sentence:
    # Frequency map of vowels    
    if i in ('a', 'e', 'i', 'o', 'u'):
        vowels += 1
        frequency[i] += 1
    elif i.isalpha():
        consonants += 1
    else:
        symbols += 1

print("The number of consonants is", consonants)
print("The number of vowels is", vowels)
print("The number of symbols is", symbols)
print(frequency)
