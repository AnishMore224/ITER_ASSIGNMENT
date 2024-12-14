def supplies_data(supplies):
    sup={}
    for item in supplies:
        sup[item[0]]={item[1]:item[2]}
    return sup

supplies=eval(input("Enter Supplies: "))
print("Output:\n",supplies_data(supplies))

'''
Output--
Enter Supplies: [("Kyiv", "Food", 500), ("Moscow", "Medicines", 200), ("Lviv", "Water", 300), ("Saint Petersburg","Blankets", 100), ("Kharkiv", "Food", 150)]
Output:
 {'Kyiv': {'Food': 500}, 'Moscow': {'Medicines': 200}, 'Lviv': {'Water': 300}, 'Saint Petersburg': {'Blankets': 100}, 'Kharkiv': {'Food': 150}}
 '''