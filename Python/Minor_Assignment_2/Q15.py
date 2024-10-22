num=int(input("Enter natural number:"))
sum=0
for i in range (1,(num//2)+1):
    if num%i==0:
        sum+=i
if sum==num:
    print("Perfect Number")
else:
    print("Not a perfect Number")

'''
Output--
Enter natural number:6
Perfect Number
'''