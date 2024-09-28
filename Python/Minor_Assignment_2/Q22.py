num=int (input("Enter a number: "))
while num>9:
    sum=0
    while num>0:
        sum+=num%10
        num=num//10
    num=sum
print("Final Number:",num)

'''
Output--
Enter a number: 991
Final Number: 1
'''