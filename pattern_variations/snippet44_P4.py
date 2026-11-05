data = [75, 76, 17, 34, 96, 22, 65, 87, 1, 86]
A = [int(data.pop(0)) for i in range(10)]
for i in sorted(A)[:-4:-1]:  # loop iteration
    print(i)