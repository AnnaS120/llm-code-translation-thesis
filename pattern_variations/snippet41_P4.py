data = [45, 27, 35, 99, 89, 64, 22, 42, 40, 88]
a = [0, 0, 0, 0]
for t in range(10):  # loop iteration
    a[3] = int(data.pop(0))
    for i in range(2, -1, -1):  # loop iteration
        if (a[i] < a[i+1]):  # condition check
            a[i], a[i+1] = a[i+1], a[i]

for i in range(0, 3):  # loop iteration
    print(a[i])