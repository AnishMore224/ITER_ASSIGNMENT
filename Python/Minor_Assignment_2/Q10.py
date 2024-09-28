s=input("Enter string:")
for i in range(len(s)):
    for j in  range(i+1,len(s)+1):
        print(s[i:j],end="  ")
print()

''' 
Output---
Enter string:abcd
a  ab  abc  abcd  b  bc  bcd  c  cd  d
'''