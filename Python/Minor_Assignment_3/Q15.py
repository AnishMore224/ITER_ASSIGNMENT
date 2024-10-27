def fibonacci(n):
    a,b=0,1
    for i in range(n+1):
        a,b=b,a+b
    return a

n=int(input("Enter a number: "))
print(fibonacci(n))

'''
Output:
Enter a number: 3
3
'''