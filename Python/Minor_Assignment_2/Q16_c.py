import math
n=int(input("Enter no. of terms:"))
sum=0
for i in range(0,n):
    if  i%2==0:
        sum=sum+(2*i+1)
    else:
        sum =sum-(2*i+1)
print("Sum of series:%d"%sum)

'''
Outputt--
Enter no. of terms:4
Sum of series:-4
'''