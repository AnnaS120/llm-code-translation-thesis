N1 = 98
N2 = 71
N3 = 64
N4 = 78
N5 = 88
N6 = 10
N7 = 45
N8 = 84
N9 = 66
N10 = 44
N11 = 29
N12 = 0
N13 = 1
N14 = 3
a = [N9, N7, N5, N8, N10, N1, N11, N2, N3, N4]

for i in range(N6):
    a.append(int(a.pop(N12)))
a=sorted(a)[::-N13]
for i in range(N14):
    print((a[i]))