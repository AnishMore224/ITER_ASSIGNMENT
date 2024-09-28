for i in range(1,6):
    for j in range(5,i,-1):
        print(" ",end=" ")
    for k in range(i,0,-1):
        print(k,end=" ")
    for l in range(2,i+1):
        print(l,end=" ")
    print()

'''
Output--
        1 
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
'''