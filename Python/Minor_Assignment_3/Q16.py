def calc():
    a=int(input("Enter the a: "))
    b=int(input("Enter the b: "))
    s=input("Enter the operation (+,-,/,*): ")
    match(s):
        case '+':
            print(a+b)
        case '-':
            print(a-b)
        case '*':
            print(a*b)
        case '/':
            print(a/b)
        case _:
            print("Invalid operation")
while True:
    calc()
    if input("Do you want to continue? (y/n): ")=='n':
        break

'''
Output:
Enter the a: 5
Enter the b: 4
Enter the operation (+,-,/,*): +
9
Do you want to continue? (y/n): y
Enter the a: 5
Enter the b: 4
Enter the operation (+,-,/,*): *
20
Do you want to continue? (y/n): n
'''