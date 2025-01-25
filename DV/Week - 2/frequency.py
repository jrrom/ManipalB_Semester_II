d = {}
sentence = input("Enter a sentence: ")
for word in sentence.replace(".", "").replace(",", "").split(" "):
    if word == '':
        continue
    
    if word not in d:
        d[word] = 1
    else:
        d[word] += 1
print("The frequency of each word is: ")
for word in d:
    print(word, "appears", d[word], "times")
