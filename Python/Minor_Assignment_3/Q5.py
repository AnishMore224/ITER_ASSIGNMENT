def countDigits(n):
    count=0
    while n!=0:
        count+=1
        n=n//10
    return count

n=int(input("Enter a number:"))
print("Number of digits in the number:",countDigits(n))

'''
Output--
Enter a number:6887192
Number of digits in the number: 7
'''