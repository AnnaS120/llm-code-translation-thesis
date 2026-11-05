N1 = 71
N2 = 43
N3 = 63
N4 = 60
N5 = 35
N6 = 10
N7 = 24
N8 = 74
N9 = 32
N10 = 53
N11 = 0
N12 = 7
N13 = 3
data = [N8, N2, N4, N10, N7, N5, N3, N9, N12, N1]
height = [int(data.pop(N11)) for i in range(N6)]
sort = sorted(height, reverse=True)
for i in range(N13):
    print((sort[i]))