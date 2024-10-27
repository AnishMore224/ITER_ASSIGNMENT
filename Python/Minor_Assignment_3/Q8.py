def days(n):
    if n in [1,3,5,7,8,10,12]:
        print("No of days: 31 days")
    elif n in [4,6,9,11]:
        print("No of days: 30 days")
    else:
        print("No of days: 28/29 days")

n=int(input("Enter a month number: "))
days(n)

'''
Output--
Enter a month number: 4
No of days: 30 days
'''
        