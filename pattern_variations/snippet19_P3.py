N1 = 78
N2 = 53
N3 = 60
N4 = 10
N5 = 32
N6 = 26
N7 = 35
N8 = 49
N9 = 9
N10 = 0
N11 = 1
N12 = 2
N13 = 7
l = [N3, N9, N6, N13, N7, N8, N1, N1, N5, N2]

for _ in range(N4):
    l.append(int(l.pop(N10)))
l.sort(reverse=True)
print(l[N10])
print(l[N11])
print(l[N12])