a = int(input("Enter a:"))
b = int(input("Enter b:"))
c = int(input("Enter c:"))
print("Sorted data:",min(a,b,c),a+b+c-min(a,b,c)-max(a,b,c),max(a,b,c))

'''
Output---
Enter a:4
Enter b:2
Enter c:8
Sorted data: 2 4 8
'''