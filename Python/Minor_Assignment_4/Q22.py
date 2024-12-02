import statistics as s
import numpy as np
L=[1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 5]
print("Frequency of each rating:")
for i in range(1,6):
    print(i,":",L.count(i))
print("Minimum:",min(L))
print("Maximum:",max(L))
print("Range:",max(L)-min(L))
print("Mean:",s.mean(L))
print("Median:",s.median(L))
print("Mode:",s.mode(L))
print("Variance: %.3f"%s.variance(L))
print("Standard deviation: %.3f"%s.stdev(L))

'''
Output--
Frequency of each rating:
1 : 3
2 : 4
3 : 8
4 : 2
5 : 3
Minimum: 1
Maximum: 5
Range: 4
Mean: 2.9
Median: 3.0
Mode: 3
Variance: 1.568
Standard deviation: 1.252
'''