import numpy as np

array1 = np.arange(2,19,2).reshape(3, 3)
array2 = np.arange(9,0,-1).reshape(3, 3)
result = array1 * array2

print("Reshaped Array 1:\n", array1)
print("Reshaped Array 2:\n", array2)
print("Result of multiplication:\n", result)

'''
Output--
Reshaped Array 1:
 [[ 2  4  6]
 [ 8 10 12]
 [14 16 18]]
Reshaped Array 2:
 [[9 8 7]
 [6 5 4]
 [3 2 1]]
Result of multiplication:
 [[18 32 42]
 [48 50 48]
 [42 32 18]]
 '''