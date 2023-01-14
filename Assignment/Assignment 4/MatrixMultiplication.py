# author: yuantuo666@gmail.com
# time: 2022/12/08

def read_matrix(m):
    for i in range(len(m)):
        str = input()
        arr = str.split(" ")
        m[i] = arr.copy()

def print_matrix(m):
    print("%d %d" % (len(m), len(m[0])))
    for i in range(len(m)):
        for j in range(len(m[i])):
            if (j == len(m[0]) - 1):
                print(m[i][j])
            else:
                print(m[i][j], end=" ")

def multiplication(m1,m2,m3):
    for i in range(len(m3)):
        line = [1] * len(m3[i])
        for j in range(len(m3[i])):
            sum = 0
            for k in range(len(m1[0])):
                sum = sum + (eval(m1[i][k]) * eval(m2[k][j])) # use int may overflow ?
            line[j] = sum
        m3[i] = line.copy() # don't know why cannot m3[i][j] = sum , which will change all row ??

arr = input().split(" ")
m = int(arr[0])
n = int(arr[1])
p = int(arr[2])
m1 = [[1] * n] * m
m2 = [[1] * p] * n
read_matrix(m1)
read_matrix(m2)
m3 = [[1] * p] * m
multiplication(m1, m2, m3)
print_matrix(m3)
