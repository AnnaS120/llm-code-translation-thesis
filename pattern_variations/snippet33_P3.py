N1 = 47
N2 = 78
N3 = 38
N4 = 94
N5 = 43
N6 = 92
N7 = 60
N8 = 10
N9 = 54
N10 = 0
N11 = 8
N12 = 3
height_li = [N3, N6, N4, N2, N5, N9, N11, N1, N3, N7]
import sys

for i in range(N8):
    height_li.append(int(height_li.pop(N10)))
for i in range(N12):
    print((sorted(height_li,reverse=True)[i]))