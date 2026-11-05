a = [77, 14, 37, 91, 13, 41, 35, 72, 23, 38]

for i in range(1,11):  # loop iteration
    b=int(a.pop(0))
    a.append(b)
a.sort(reverse=True)
for i in range(3):  # loop iteration
    print((a[i]))