N1 = 95
N2 = 97
N3 = 11
N4 = 36
N5 = 10
N6 = 90
N7 = 12
N8 = 98
N9 = 72
N10 = 0
N11 = 2
N12 = 3
m = [N4, N9, N2, N8, N1, N2, N11, N7, N6, N3]

for i in range(N5):
    x = int(m.pop(N10))
    m.append(x)
m.sort()
m.reverse()
for i in range(N10,N12):
    print(m[i])
