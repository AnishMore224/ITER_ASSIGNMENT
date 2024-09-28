num=int (input("Enter a number: "))
i=1
flag=True
while num>1:
    if num % i !=0:
        flag=False
        break
    num=num//i
    i+=1
if flag:
    print("Factorial number")
else:
    print("Not a factorial number")

'''
Output---
Enter a number: 120
Factorial number
'''