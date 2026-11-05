N1 = 72
N2 = 14
N3 = 23
N4 = 38
N5 = 11
N6 = 77
N7 = 13
N8 = 91
N9 = 37
N10 = 41
N11 = 35
N12 = 0
N13 = 1
N14 = 3
a = [N6, N2, N9, N8, N7, N10, N11, N1, N3, N4]

for i in range(N13,N5):
    b=int(a.pop(N12))
    a.append(b)
a.sort(reverse=True)
for i in range(N14):
    print((a[i]))