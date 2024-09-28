num=int(input("Enter a number:"))
available_amount=int (input("Enter the available amount in the ATM:"))
if num%10==0 and  num<=available_amount:
    if num>=100:
        print(num//100,"100 notes")
        num%=100
    if  num>=50:
        print(num//50,"50 notes")
        num%=50
    if  num>=20:
        print(num//20,"20 notes")
        num %=20
    if   num>=10:
        print(num//10,"10 notes")
        num=0
elif num> available_amount:
    print("Insufficient amount in the ATM")
else:
    print("Invalid amount") 

'''
Output--
Enter a number:1190
Enter the available amount in the ATM:1200
11 100 notes
1 50 notes
2 20 notes
'''