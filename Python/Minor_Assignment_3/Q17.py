def vowelRemove(s):
    for i in ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']:
        s = s.replace(i, '')
    return s

s=input("Enter a string: ")
print("After removing vowels:",vowelRemove(s))


'''
Output:
Enter a string: anish
After removing vowels: nsh
'''