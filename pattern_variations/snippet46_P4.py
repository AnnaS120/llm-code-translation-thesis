a = [66, 45, 88, 84, 44, 98, 29, 71, 64, 78]

for i in range(10):  # loop iteration
    a.append(int(a.pop(0)))
a=sorted(a)[::-1]
for i in range(3):  # loop iteration
    print((a[i]))