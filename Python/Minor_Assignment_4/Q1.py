import random as r
n=int(input("Enter N:"))
L=[r.random()  for i in range(n)]
s=sum(L)
print("Random list: ",L)
print("Sum: %.2f"%s)
print("Average: %.2f"%(s/n))

'''
Output--
Enter N:5
Random list:  [0.2532507414408488, 0.751389081119467, 0.5014945614943557, 0.7102580845384576, 0.18894512208938008]
Sum: 2.41
Average: 0.48
'''