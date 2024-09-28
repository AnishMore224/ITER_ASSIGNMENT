import math
n=int(input("Enter a number:"))
sum=0
for j in range(2,n):
    b=True
    for i in range(2,int(math.sqrt(j)+1)):
        if j%i==0:
            b=False
    if b:
        sum+=j
print("Sum:",sum)
'''
Output--
Enter a number:20
Sum: 77
'''