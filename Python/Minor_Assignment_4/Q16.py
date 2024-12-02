def multiply_matrix(matrix1, matrix2):
    result = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
    for i in range(len(matrix1)):
        for j in range(len(matrix2[0])):
            for k in range(len(matrix2)):
                result[i][j] += matrix1[i][k] * matrix2[k][j]
    return result

l1=list(map(int,input("Enter matrix1: ").split()))
l2=list(map(int,input("Enter matrix2: ").split()))
matrix1 = [l1[i:i+3] for i in range(0, len(l1), 3)]
matrix2 = [l2[i:i+3] for i in range(0, len(l2), 3)]
result = multiply_matrix(matrix1, matrix2)
print(result)

'''
Output--
Enter matrix1: 1 2 3 4 5 6 7 8 9 
Enter matrix2: 1 2 3 4 5 6 7 8 9
[[30, 36, 42], [66, 81, 96], [102, 126, 150]]
'''