def high_alert_cities_information(high_alert_cities, data):
    high_alert_cities_info = {}
    for city in high_alert_cities:
        for item in data:
            if item[0] == city:
                high_alert_cities_info[city] = item
                break
    return high_alert_cities_info,sum([item[1] for item in high_alert_cities_info.values()]),sum([item[2] for item in high_alert_cities_info.values()])

high_alert_cities=eval(input("Enter High Alert Cities: "))
city_data=eval(input("Enter City Data: "))
high_alert_cities_info, total_population, total_supplies=high_alert_cities_information(high_alert_cities, city_data)

print("\nOutput:")
print("High Alert Cities Information: ",high_alert_cities_info)
print("Total Population: ",total_population)
print("Total Supplies: ",total_supplies)

'''
Output--
Enter High Alert Cities: ["Kyiv", "Lviv"] 
Enter City Data: [("Kyiv", 2800000, 250), ("Kharkiv", 1431000, 180), ("Lviv",721301, 90), ("Odessa", 1029049, 120)]

Output:
High Alert Cities Information:  {'Kyiv': ('Kyiv', 2800000, 250), 'Lviv': ('Lviv', 721301, 90)}
Total Population:  3521301
Total Supplies:  340
'''