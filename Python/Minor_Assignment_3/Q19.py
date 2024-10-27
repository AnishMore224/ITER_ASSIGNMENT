def gcd(x,y):
    while y!=0:
        x,y=y,x%y
    return x

x=int(input("Enter the first number: "))
y=int(input("Enter the second number: "))
print("GCD of",x,"and",y,"is",gcd(x,y))

'''
Output:
Enter the first number: 9
Enter the second number: 27
GCD of 9 and 27 is 9
'''