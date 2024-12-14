def cleaned_list(input_list):
    return sorted(list(set(input_list)))

def main():
    cleaned_cities= cleaned_list(eval(input("Enter list of cities: ")))
    print("Cleaned Cities:",cleaned_cities)

if __name__ == "__main__":
    main()

'''
Output--
Enter list of cities: ["Kyiv", "Kharkiv", "Odessa", "Kyiv", "Lviv", "Kharkiv", "Dnipro"]
Cleaned Cities: ['Dnipro', 'Kharkiv', 'Kyiv', 'Lviv', 'Odessa']
'''