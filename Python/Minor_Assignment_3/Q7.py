def isVowel(s):
    if s in ['a', 'e', 'i', 'o', 'u']:
        return True
    return False

s = input("Enter a alphabet:")
if isVowel(s):
    print("The alphabet is a vowel.")
else:
    print("The alphabet is consonant.")
    
'''
Output--
Enter a alphabet:u
The alphabet is a vowel.
'''