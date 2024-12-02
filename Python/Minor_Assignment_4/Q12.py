L=[]
for i in range(3):
    L.append(list(map(float,input().split())))
for i in range(4):
    sum=0
    for j in range(3):
        sum+=L[j][i]
    print("Sum of col %d: %.2f"%(i,sum))

        
'''
Output--
1.5 2 3 4
5.5 6 7 8
9.5 1 3 1
Sum of col 0: 16.50
Sum of col 1: 9.00
Sum of col 2: 13.00
Sum of col 3: 13.00
'''
