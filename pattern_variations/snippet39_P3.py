N1 = 47
N2 = 29
N3 = 95
N4 = 64
N5 = 75
N6 = 73
N7 = 12
N8 = 52
N9 = 84
N10 = 35
N11 = 0
N12 = 1
N13 = 3
a = [N9, N10, N8, N1, N6, N5, N2, N3, N4, N7]
b = [N11, N11, N11]
for i in a:
    j = N11
    while j < N13:
        if i > b[j]:
            b.insert(j, i)
            break
        j += N12

for i in b[:N13]:
    print(i)