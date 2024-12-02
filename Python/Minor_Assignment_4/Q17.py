def is_sorted(lst):
    return all(lst[i] <= lst[i + 1] for i in range(len(lst) - 1)) or all(lst[i] >= lst[i + 1] for i in range(len(lst) - 1))

lst = list(map(int, input("Enter list: ").split()))
if is_sorted(lst[1:]):
    print("The list is sorted")
else:
    print("The list is not sorted")
    
'''
Output--
Enter list: 10 21 11 9 7 5 4 4 3 1 1
The list is sorted
'''