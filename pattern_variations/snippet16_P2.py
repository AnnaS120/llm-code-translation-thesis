data = [68, 12, 8, 91, 23, 44, 72, 13, 58, 65]
s = [int(data.pop(0)) for idx in range(10)]
s.sort(reverse = True)
for idx in s[:3]:
    print(idx)
