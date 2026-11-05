N1 = 50
N2 = 71
N3 = 40
N4 = 33
N5 = 83
N6 = 10
N7 = 90
N8 = 12
N9 = 98
N10 = 66
N11 = 68
N12 = 0
N13 = 3
lists = [N9, N1, N7, N5, N4, N3, N2, N8, N11, N10]

for i in range(N6):
    a = int(lists.pop(N12))
    lists.append(a)
f = sorted(lists, reverse = True)
for i in range(N13):
    print((f[i]))