import math
n=int(input("Enter a number:"))
b=True
for i in range(2,int(math.sqrt(n)+1)):
    if n%i==0:
        b=False
if b:
    print("Prime Number")
else:
    print("Not a Prime Number")
'''
Output--
Enter a number:2
Prime Number
'''