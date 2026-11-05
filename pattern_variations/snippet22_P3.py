N1 = 95
N2 = 99
N3 = 46
N4 = 80
N5 = 76
N6 = 94
N7 = 53
N8 = 63
N9 = 10
N10 = 35
N11 = 0
N12 = 1
N13 = 5
N14 = 2
data = [N3, N10, N4, N7, N2, N1, N8, N6, N13, N5]
max = [N11,N11,N11]
for a in range(N9):
    s = int(data.pop(N11))
    if max[N11] < s:
        max[N14] = max[N12]
        max[N12] = max[N11]
        max[N11] = s
    elif max[N12] < s:
        max[N14] = max[N12]
        max[N12] = s
    elif max[N14] < s:
        max[N14] = s
for a in max:
    print(a)
