data = [74, 43, 60, 53, 24, 35, 63, 32, 7, 71]
height = [int(data.pop(0)) for i in range(10)]
sort = sorted(height, reverse=True)
for i in range(3):
    print((sort[i]))