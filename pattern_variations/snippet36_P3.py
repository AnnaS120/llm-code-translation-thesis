N1 = 71
N2 = 55
N3 = 14
N4 = 80
N5 = 51
N6 = 78
N7 = 17
N8 = 94
N9 = 77
N10 = 10
N11 = 82
N12 = 0
N13 = 3
mount = [N1, N4, N3, N8, N7, N6, N11, N5, N9, N2]

for i in range(N12, N10):
    n = int(mount.pop(N12))
    mount.append(n)

mount.sort(reverse = True)

for i in range(N12, N13):
    print(mount[i])