import random as r
L=[]

for i in range(4):
    L.append([r.randint(0,1) for i in range(4)])
print(L)
r,c,maxr,maxc=-1,-1,0,0
for i in range(4):
    sumr,sumc=0,0
    for j in range(4):
        sumr+=L[i][j]
        sumc+=L[j][i]
    if sumc>maxc:
        c=i
        maxc=sumc
    if sumr>maxr:
        r=i
        maxr=sumr
print("The largest row index: %d"%r)
print("The largest column index: %d"%c)
    
'''
Output--
[[1, 1, 1, 1], [0, 1, 0, 0], [1, 1, 0, 1], [1, 1, 0, 1]]
The largest row index: 0
The largest column index: 1
'''