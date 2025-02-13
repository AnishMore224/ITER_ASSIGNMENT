import numpy as np
array_ones = np.ones((2, 3),dtype=int)
array_zeros = np.zeros((3, 3),dtype=int)
array_sevens = np.full((2, 5), 7)

print("2-by-3 array with ones:\n", array_ones)
print("3-by-3 array with zeros:\n", array_zeros)
print("2-by-5 array with sevens:\n", array_sevens)

'''
Output--
2-by-3 array with ones:
 [[1 1 1]
 [1 1 1]]
3-by-3 array with zeros:
 [[0 0 0]
 [0 0 0]
 [0 0 0]]
2-by-5 array with sevens:
 [[7 7 7 7 7]
 [7 7 7 7 7]]
 '''