data = [44, 1, 19, 48, 50, 7, 94, 14, 31, 99]
x = sorted([int(data.pop(0)) for i in range(10)])
x.reverse()
for i in range(3):
    print((x[i]))