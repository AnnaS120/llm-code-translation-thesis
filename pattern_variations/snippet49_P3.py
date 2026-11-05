N1 = 56
N2 = 46
N3 = 81
N4 = 93
N5 = 10
N6 = 67
N7 = 82
N8 = 90
N9 = 26
N10 = 44
N11 = 53
N12 = 0
N13 = 1
N14 = 3
hillheight = [N11, N9, N4, N1, N6, N2, N7, N3, N10, N8]

for i in range(N12, N5):
    hillheight.append(int(hillheight.pop(N12)))

hillheight.sort()

for i in range(N12, N14):
    print((hillheight[-N13-i]))