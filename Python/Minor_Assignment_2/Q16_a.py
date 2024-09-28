import math
n=int(input("Enter no. of terms:"))
x=float(input("Enter the value of x:"))
sum=0
for i in range(0,n):
    if  i%2==0:
        sum=sum+((x**(2*i))/math.factorial(2*i))
    else:
        sum=sum-((x**(2*i))/math.factorial(2*i))
print("Sum of series:%.3f"%sum)

'''
Output--
Enter no. of terms:3
Enter the value of x:2
Sum of series:-0.333
'''