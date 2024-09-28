while True:
    a=int(input("Enter a number:"))
    b=int(input("Enter a number:"))
    operator=input("Enter an operator (+, -, *, /):")
    match operator:
        case "+":
            print(a+b)
        case  "-":
            print(a-b)
        case  "*":
            print(a*b)
        case   "/":
            if b!=0:
                print(a/b)
            else:
                print("Error: Division by zero is not allowed.")
        case _:
            print("Error: Invalid operator")
    ch =input("Do you want to perform another operation(yes/exit):")
    if ch.lower() == "exit":
        break

'''
Output--
Enter a number: 12
Enter a number: 5
Enter an operator (+, -, *, /): -
7
Do you want to perform another operation(yes/exit): yes
Enter a number: 5
Enter a number: 8
Enter an operator (+, -, *, /): *
40
Do you want to perform another operation(yes/exit): exit
'''