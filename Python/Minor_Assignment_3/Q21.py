def factoraial(n):
    p=1
    for i in range(1,n+1):
        p*=i
    return p

n=int(input("Enter a number: "))
print("Factorial of",n,"is",factoraial(n))

'''
Output:
Enter a number: 5
Factorial of 5 is 120
'''
