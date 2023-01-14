# author: yuantuo666@gmail.com
# time: 2022/12/08

times = int(input())

for j in range(0, times):
    str = input()
    inp = str.split(", ")
    n = int(inp[0])
    d = int(inp[1])

    if n < d:
        print("invalid")
        continue

    n = n - 1

    series = [1, 1]
    for i in range(2, n + 1):
        series.append(series[i-1] + series[i-2])

    for i in range(n, n-d, -1):
        if i != (n-d+1):
            print(series[i], end=", ")
        else:
            print(series[i], end="")
    print()

