L=eval(input("Enter list: "))
n=int(input("Enter element to remove: "))
while(n in L):
    L.remove(n)
print(L)

'''
Output--
Enter list: [1,2,3,4,1,3,1]
Enter element to remove: 1
[2, 3, 4, 3]
'''