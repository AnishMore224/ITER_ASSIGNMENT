import pandas as pd
import matplotlib.pyplot as plt

celsius_to_kelvin = lambda c: c + 273.15
celsius_temps = [0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
kelvin_temps = list(map(celsius_to_kelvin, celsius_temps))
data = {'Celsius': celsius_temps, 'Kelvin': kelvin_temps}
df = pd.DataFrame(data)
print(df)

plt.plot(df['Celsius'], df['Kelvin'], marker='o')
plt.title('Celsius to Kelvin Conversion')
plt.xlabel('Celsius')
plt.ylabel('Kelvin')
plt.grid(True)
plt.show()

'''
Output---
    Celsius  Kelvin
0         0  273.15
1        10  283.15
2        20  293.15
3        30  303.15
4        40  313.15
5        50  323.15
6        60  333.15
7        70  343.15
8        80  353.15
9        90  363.15
10      100  373.15
'''