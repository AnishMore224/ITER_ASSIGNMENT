user_input = input("Enter an integer: ")
is_valid = True
has_minus = False

for i, char in enumerate(user_input):
    ascii_value = ord(char)
    
    if i == 0 and ascii_value == 45:
        has_minus = True
        continue

    if ascii_value < 48 or ascii_value > 57:
        is_valid = False
        break
    
if has_minus and len(user_input) == 1:
    is_valid = False

if is_valid:
    num = int(user_input)

    remainder = num % 5

    match remainder:
        case 0:
            print(f"The remainder when {num} is divided by 5 is 0.")
        case 1:
            print(f"The remainder when {num} is divided by 5 is 1.")
        case 2:
            print(f"The remainder when {num} is divided by 5 is 2.")
        case 3:
            print(f"The remainder when {num} is divided by 5 is 3.")
        case 4:
            print(f"The remainder when {num} is divided by 5 is 4.")
else:
    print("Invalid input")

'''
Output:
Enter an integer: -12
The remainder when -12 is divided by 5 is 3.
'''