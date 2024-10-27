def isArmstrong(n):
    count=0
    temp=n
    while temp>0:
        count+=1
        temp//=10
    temp=n
    arm=0
    while temp>0:
        arm+=(temp%10)**count
        temp//=10
    return arm==n

n=int(input("Enter a number: "))
print("Armstrong" if isArmstrong(n) else "Not Armstrong")

'''
Output:
Enter a number: 1634
Armstrong
'''