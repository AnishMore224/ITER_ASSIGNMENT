def pallindrome(s):
    if s == s[::-1]:
        return True
    else:
        return False

s = input("Enter a string:")
if pallindrome(s):
    print("The string is a pallindrome.")
else:
    print("The string is not a pallindrome.")
    
'''
Output--
Enter a string:madam
The string is a pallindrome.
'''