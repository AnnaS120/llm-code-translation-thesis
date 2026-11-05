data = [45, 27, 35, 99, 89, 64, 22, 42, 40, 88]
x = [0, 0, 0, 0]
for t in range(10):
    x[3] = int(data.pop(0))
    for i in range(2, -1, -1):
        if (x[i] < x[i+1]):
            x[i], x[i+1] = x[i+1], x[i]

for i in range(0, 3):
    print(x[i])