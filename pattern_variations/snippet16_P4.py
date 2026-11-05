data = [68, 12, 8, 91, 23, 44, 72, 13, 58, 65]
s = [int(data.pop(0)) for i in range(10)]
s.sort(reverse = True)
for i in s[:3]:  # loop iteration
    print(i)