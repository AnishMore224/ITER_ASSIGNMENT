def coprime(x,y):
    while y!=0:
        x,y=y,x%y
    return x==1

x=int(input("Enter the first number: "))
y=int(input("Enter the second number: "))
print("Coprime" if coprime(x,y) else "Not Coprime")

'''
Output:
Enter the first number: 1 
Enter the second number: 11
Coprime
'''