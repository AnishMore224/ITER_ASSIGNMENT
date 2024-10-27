def largest(n):
    l1=l2=l3=0
    while n!=0:
        b=n%10
        if b>l1:
            l3=l2
            l2=l1
            l1=b
        elif b>l2:
            l3=l2
            l2=b
        elif b>l3:
            l3=b
        n=n//10
    print("First largest digit:",l1)
    print("Second largest digit:",l2)
    print("Third largest digit:",l3)
    
n=int(input("Enter a number: "))
largest(n)

'''
Output--
Enter a number: 6328
First largest digit: 8
Second largest digit: 6
Third largest digit: 3
'''