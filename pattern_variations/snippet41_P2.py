data = [45, 27, 35, 99, 89, 64, 22, 42, 40, 88]
a = [0, 0, 0, 0]
for t in range(10):
    a[3] = int(data.pop(0))
    for idx in range(2, -1, -1):
        if (a[idx] < a[idx+1]):
            a[idx], a[idx+1] = a[idx+1], a[idx]

for idx in range(0, 3):
    print(a[idx])