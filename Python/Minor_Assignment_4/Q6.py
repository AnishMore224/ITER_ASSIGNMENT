L=[]
print("Enter 10 Numbers: ",end="")
for i in range(10):
    L.append(int(input()))
n=int(input("Enter number to search: "))
if n in L:
    print("%d is present %d times"%(n,L.count(n)))
else:
    print("%d is not present in list"%n)
    
'''
Output--
Enter 10 Numbers: 1
2
3
2
4 
6
2
1
3
6 
Enter number to search: 2
2 is present 3 times
'''