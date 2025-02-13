import numpy as np
array = np.arange(4).reshape(2, 2)
print("Original array:\n",array)
print("Cubed array:\n",array **3)
print("Array with 7 added:\n",array + 7)
print("Array multiplied by 2:\n",array * 2)

'''
Output--
Original array:
 [[0 1]
 [2 3]]
Cubed array:
 [[ 0  1]
 [ 8 27]]
Array with 7 added:
 [[ 7  8]
 [ 9 10]]
Array multiplied by 2:
 [[0 2]
 [4 6]]
 
'''