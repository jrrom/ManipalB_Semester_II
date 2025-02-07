record = {
    1975: "West Indies",
    1979: "West Indies",
    1983: "India",
    1987: "Australia",
    1992: "Pakistan",
    1996: "Sri Lanka",
    1999: "Australia",
    2003: "Australia",
    2007: "Australia",
    2011: "India",
    2015: "Australia",
    2019: "England",
    2023: "Australia"
}

countries = list(record.values())
freq = dict([(country, countries.count(country)) for country in set(countries)])

print("The best performing country is", max(freq, key = freq.get), "with", max(freq.values()), "wins")
print("Unique list is", list(freq.keys()))
