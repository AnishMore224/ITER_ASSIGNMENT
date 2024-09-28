import math
n=int(input("Enter no. of terms:"))
x=float(input("Enter the value of x:"))
sum=0
for i in range(0,n):
    sum+=x**i/math.factorial(i)
print("Sum of series:%.3f"%sum)

'''
Outputt--
Enter no. of terms:4
Enter the value of x:2
Sum of series:6.333
'''