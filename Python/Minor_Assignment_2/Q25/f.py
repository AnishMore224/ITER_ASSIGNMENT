for i in range(4):
    for j in range(7):
        if i+j>=3 and j-i<=3:
            print("*", end=" ")
        else:
            print(" ", end=" ")
    print()
for i in range(3):
    for j in range(7):
        if j-i>=1 and i+j<=5:
            print("*", end=" ")
        else:
            print(" ", end=" ")
    print()
    
'''
Output--
      *       
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *
'''