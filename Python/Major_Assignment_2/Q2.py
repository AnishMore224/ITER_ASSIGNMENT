from Q1 import cleaned_list
def union_intersection(cleaned_cities, previous_intel):
    return set(cleaned_cities | previous_intel), set((cleaned_cities - previous_intel)| (previous_intel-cleaned_cities)), set(cleaned_cities & previous_intel)

cleaned_cities= set(cleaned_list(eval(input("Enter list of cities: "))))
previous_intel= eval(input("Enter cities obtained from the previous intel: "))
union_cities,unique_cities,intersection_cities=union_intersection(cleaned_cities,previous_intel)
print("\nUnion of Cities: ",union_cities)
print("Unique Cities: ",unique_cities)
print("Intersection of Cities:",intersection_cities)

'''
Output--
Enter list of cities: ["Kyiv", "Kharkiv", "Odessa", "Kyiv", "Lviv", "Kharkiv", "Dnipro"]
Enter cities obtained from the previous intel: {"Kyiv", "Mariupol", "Lviv", "Donetsk"}

Union of Cities:  {'Kharkiv', 'Mariupol', 'Odessa', 'Donetsk', 'Kyiv', 'Lviv', 'Dnipro'}
Unique Cities:  {'Kharkiv', 'Mariupol', 'Odessa', 'Donetsk', 'Dnipro'}
Intersection of Cities: {'Kyiv', 'Lviv'}
'''