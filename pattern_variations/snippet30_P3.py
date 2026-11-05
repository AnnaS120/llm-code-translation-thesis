N1 = 64
N2 = 99
N3 = 86
N4 = 61
N5 = 94
N6 = 10
N7 = 24
N8 = 45
N9 = 32
N10 = 41
N11 = 26
N12 = 0
N13 = 3
mountains = [N7, N4, N10, N9, N11, N3, N5, N1, N2, N8]

for i in range(N6):
    m = int(mountains.pop(N12))
    mountains.append(m)

mountains.sort(reverse=True)

for i in range(N13):
    print((mountains[i]))
