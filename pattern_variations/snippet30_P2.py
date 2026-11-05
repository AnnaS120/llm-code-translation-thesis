mountains = [24, 61, 41, 32, 26, 86, 94, 64, 99, 45]

for idx in range(10):
    m = int(mountains.pop(0))
    mountains.append(m)

mountains.sort(reverse=True)

for idx in range(3):
    print((mountains[idx]))
