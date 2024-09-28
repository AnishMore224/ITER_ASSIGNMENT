import math
num=  int(input("Enter a number: "))
for i in range (2,int(math.sqrt(num))+1):
    temp=i
    while  num%i==0:
        print(i,end=" ")
        num=num//i
print()

'''
Output--
Enter a number: 120
2 2 2 3 5
'''