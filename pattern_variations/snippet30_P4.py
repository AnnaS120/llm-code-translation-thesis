mountains = [24, 61, 41, 32, 26, 86, 94, 64, 99, 45]

for i in range(10):  # loop iteration
    m = int(mountains.pop(0))
    mountains.append(m)

mountains.sort(reverse=True)

for i in range(3):  # loop iteration
    print((mountains[i]))