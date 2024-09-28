num=int(input("Enter a number:"))
while num<=0:
    num=int(input("Number should be positive.Enter number:"))
if num%2==0:
    num*=2
else:
    num**=2
print("Result:",num)


'''
Output--
Enter a number:-2
Number should be positive.Enter number:4
Result: 8
'''