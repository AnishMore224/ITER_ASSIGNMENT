import statistics as s
data=[1, 2, 3, 2, 3, 4, 4, 4, 5, 4, 5, 6]
print("Mean:%.3f"%s.mean(data))
print("Median:",s.median(data))
print("Mode:",s.mode(data))

'''
Output---
Mean:3.583
Median: 4.0
Mode: 4
'''