import pandas as pd

data = {
    "roll": [1, 2, 3, 4, 5, 6],
    "name": ["Nasa", "Isro", "Ramanujan", "Torvalds", "T-Rex", "Paras"],
    "gender": ["F", "F", "M", "M", "F", "M"],
    "marks1": [78, 77, 100, 45, 10, 95],
    "marks2": [88, 60, 100, 80, 20, 92],
    "marks3": [60, 70, 100, 85, 15, 90]
}

df = pd.DataFrame(data)

df["total"] = df["marks1"] + df["marks2"] + df["marks3"]

print("Lowest in first subject:", df["marks1"].min())

print("Highest in second subject:", df["marks2"].max())

print("Average mark in third subject:", df["marks3"].mean())

print("Student with highest average:", df["name"][df["total"].idxmax()], "with", df["total"].max() / 3, "average")

fail_count = (df["marks2"] < 40).sum()

print("Number of fails:", fail_count)
