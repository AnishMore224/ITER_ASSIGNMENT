def modify(s):
    for i in ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']:
        s = s.replace(i, '*')
    return s

s=input("Enter a string: ")
print("After modifying:",modify(s))

'''
Output:
Enter a string: anish
After modifying: *n*sh
'''