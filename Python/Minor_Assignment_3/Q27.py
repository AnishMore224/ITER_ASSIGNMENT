def digitToWord(digit):
    if digit == 0:
        return "Zero"
    elif digit == 1:
        return "One"
    elif digit == 2:
        return "Two"
    elif digit == 3:
        return "Three"
    elif digit == 4:
        return "Four"
    elif digit == 5:
        return "Five"
    elif digit == 6:
        return "Six"
    elif digit == 7:
        return "Seven"
    elif digit == 8:
        return "Eight"
    elif digit == 9:
        return "Nine"
    else:
        return "Invalid Digit"

def numberToWord(number):
    word = ""
    while number != 0:
        digit = number % 10
        word = digitToWord(digit) + " " + word
        number = number // 10
    return word

num = int(input("Enter a number: "))
print(numberToWord(num))

'''
Output:
Enter a number: 85
Eight Five
''' 