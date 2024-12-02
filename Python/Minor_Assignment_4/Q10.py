def sum1(t):
    sum=0
    for i in t:
        for j in i:
            if isinstance(j,(int, float)):
                sum+=j
    print("Sum: ",sum)


t=eval(input("Enter tuple of tuples: "))
sum1(t)


'''
Output--
Enter tuple of tuples: ((1,2,3),(1,2,'a'))
Sum:  9
'''