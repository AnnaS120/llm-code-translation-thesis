N1 = 64
N2 = 99
N3 = 40
N4 = 42
N5 = 35
N6 = 88
N7 = 10
N8 = 45
N9 = 27
N10 = 22
N11 = 89
N12 = 0
N13 = 1
N14 = 2
N15 = 3
data = [N8, N9, N5, N2, N11, N1, N10, N4, N3, N6]
a = [N12, N12, N12, N12]
for t in range(N7):
    a[N15] = int(data.pop(N12))
    for i in range(N14, -N13, -N13):
        if (a[i] < a[i+N13]):
            a[i], a[i+N13] = a[i+N13], a[i]

for i in range(N12, N15):
    print(a[i])