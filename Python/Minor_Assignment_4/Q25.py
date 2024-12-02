import matplotlib.pyplot as plt

L=[1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 5]
D={}
for i in L:
    D[i]=D.get(i,0)+1
print(D)
total=sum(D.values())
print(total)
plt.bar(D.keys(),D.values())
plt.show()
for i in D:
    D[i]=round(D[i]/total*100,2)
print(D)
plt.bar(D.keys(),D.values())
plt.show()

'''
Output--
{1: 3, 2: 4, 5: 3, 4: 2, 3: 8}
20
{1: 15.0, 2: 20.0, 5: 15.0, 4: 10.0, 3: 40.0}
'''