def binaryToDecimal(n):
    decimal=0
    i=0
    while n!=0:
        b=n%10
        decimal+=b*pow(2,i)
        n=n//10
        i+=1
    return decimal

def decimalToBinary(n):
    binary=0
    i=1
    while n!=0:
        b=n%2
        binary+=b*i
        n=n//2
        i*=10
    return binary

num = int(input("Enter a number: "))
btd=decimalToBinary(num)
dtb=binaryToDecimal(btd)
print("Binary of",num,"is",btd)
print("Decimal of",btd,"is",dtb)

'''
Output:
Enter a number: 12
Binary of 12 is 1100
Decimal of 1100 is 12
'''