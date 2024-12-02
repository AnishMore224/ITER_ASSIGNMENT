L=[]
while True:
    print('''a. Create a list of N integers
b. Display the list elements
c. Insert an element at a specific position
d. Delete an element at a given position
e. Exit''')
    ch=input("Enter choice: ")
    match(ch):
        case 'a':
            L=eval(input("Enter a list: "))
        case 'b':
            print("List: ",L)
        case 'c':
            L.insert(int(input("Enter index: ")),int(input("Enter element to insert: ")))
        case 'd':
            L.pop(int(input("Enter position to remove: ")))
        case 'e':
            break
        case _:
            print("Invalid Input")


'''
Output--
a. Create a list of N integers
b. Display the list elements
c. Insert an element at a specific position
d. Delete an element at a given position
e. Exit
Enter choice: a
Enter a list: [1,2,3,4]
a. Create a list of N integers
b. Display the list elements
c. Insert an element at a specific position
d. Delete an element at a given position
e. Exit
Enter choice: b
List:  [1, 2, 3, 4]
a. Create a list of N integers
b. Display the list elements
c. Insert an element at a specific position
d. Delete an element at a given position
e. Exit
Enter choice: c
Enter index: 1
Enter element to insert: 9
a. Create a list of N integers
b. Display the list elements
c. Insert an element at a specific position
d. Delete an element at a given position
e. Exit
Enter choice: d
Enter position to remove: 3
a. Create a list of N integers
b. Display the list elements
c. Insert an element at a specific position
d. Delete an element at a given position
e. Exit
Enter choice: b
List:  [1, 9, 2, 4]
a. Create a list of N integers
b. Display the list elements
c. Insert an element at a specific position
d. Delete an element at a given position
e. Exit
Enter choice: e
'''