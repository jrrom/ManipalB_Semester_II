import pandas as pd
temperatures = [
    17,
    25,
    30,
    18,
    19,
    24,
    22
]

index = [
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
    "Sunday"
]

temperatures = pd.Series(temperatures, index=index)
avg = np.mean(temperatures)

print("Average temperature is:", temperatures.mean())
print("Maximum temperature is:", max(temperatures), "on", temperatures.idxmax())
print("Minimum temperature is:", min(temperatures), "on", temperatures.idxmin())

specific_value = int(input("Enter specific value: "))
print(temperatures[temperatures > specific_value])

print("The temperatures converted to Fahrenheit:")
temperatures_in_fahrenheit = map(lambda temp: temp * (9/5) + 32, temperatures)
pd.Series(temperatures_in_fahrenheit, index=index)

print("Temperatures above average:")
print(temperatures[temperatures > avg])
