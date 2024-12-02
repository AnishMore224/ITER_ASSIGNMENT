L=eval(input("Enter list of tuples: "))
L.sort(key= lambda x : x[1])
print("After sorting: ",L)

'''
Output--
Enter list of tuples: [(1,5,7,4),(1,1,3),(4,2,1)] 
After sorting:  [(1, 1, 3), (4, 2, 1), (1, 5, 7, 4)]
'''