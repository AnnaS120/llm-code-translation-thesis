N1 = 87
N2 = 65
N3 = 75
N4 = 86
N5 = 34
N6 = 17
N7 = 76
N8 = 10
N9 = 96
N10 = 22
N11 = 0
N12 = 1
N13 = 4
data = [N3, N7, N6, N5, N9, N10, N2, N1, N12, N4]
A = [int(data.pop(N11)) for i in range(N8)]
for i in sorted(A)[:-N13:-N12]:
    print(i)
