data = [44, 1, 19, 48, 50, 7, 94, 14, 31, 99]
a = sorted([int(data.pop(0)) for i in range(10)])
a.reverse()
for i in range(3):
    print((a[i]))