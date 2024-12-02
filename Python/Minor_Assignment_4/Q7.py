L=eval(input("Enter a list: "))
n=len(L)
for i in range(1,n):
    L[i]+=L[i-1]
print("Cumulative list: ",L)

'''
Output--
Enter a list: [1,2,3,4,5]
Cumulative list:  [1, 3, 6, 10, 15]
'''