y=int(input("Enter a year:"))
if (y%100!=0 or  y%400==0) and y%4==0:
    print("Leap Year")
else:
    print("Not a Leap Year")

'''
Output--
Enter a year:2024
Leap Year
'''