def rotate(a,b,c):
    return c,a,b
a,b,c='Doug',22,1984
print(a,b,c,sep=" ")
a,b,c=rotate(a,b,c)
print(a,b,c,sep=" ")
a,b,c=rotate(a,b,c)
print(a,b,c,sep=" ")
a,b,c=rotate(a,b,c)
print(a,b,c,sep=" ")

'''
Output--
Doug 22 1984
1984 Doug 22
22 1984 Doug
Doug 22 1984
'''
