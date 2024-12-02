import statistics as s
L=list(map(float,input("Enter 10 numbers: ").split()))
print("the Mean is",s.mean(L))
print("The standard deviation is %.5f"%s.stdev(L))

'''
Ouutput--
Enter 10 numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2
the Mean is 3.11
The standard deviation is 1.55738
'''