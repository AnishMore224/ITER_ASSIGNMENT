import copy
L=[["Shallow", 2, 3], [4, 5, 6]]
L1=copy.copy(L)
L2=copy.deepcopy(L)
L1[0][0]="Shallow copy"
L2[0][0]="Deep copy"
print(L,L1,L2,sep="\n")

'''
Output--
[['Shallow copy', 2, 3], [4, 5, 6]]
[['Shallow copy', 2, 3], [4, 5, 6]]
[['Deep copy', 2, 3], [4, 5, 6]]
'''