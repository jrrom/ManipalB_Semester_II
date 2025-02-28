import pandas as pd

file_df = pd.read_csv("Movies.csv")
print("Movie with the maximum rating is:", file_df.loc[file_df["Rating"].idxmax()]["Movie Name"])

hindi_df = file_df[file_df["Language"] == "Hindi"]
hindi_df.to_csv("HindiMovies.csv", index=False)
