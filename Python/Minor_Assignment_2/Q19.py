num=int(input("Enter a number:"))
temp=num
rev=0
while temp> 0:
    rev=rev*10 +(temp%10)
    temp=temp//10
print("Reverse:",rev)

'''
Output--
Enter a number:1234
Reverse: 4321
'''