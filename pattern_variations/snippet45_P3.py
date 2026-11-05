N1 = 97
N2 = 28
N3 = 60
N4 = 10
N5 = 67
N6 = 82
N7 = 24
N8 = 45
N9 = 98
N10 = 68
N11 = 72
N12 = 0
N13 = 3
height = [N1, N8, N5, N7, N11, N10, N3, N6, N2, N9]

for i in range(N4):
    mountain=int(height.pop(N12))
    height.append(mountain)
height.sort()
height.reverse()
for i in range(N13):
    print((height[i]))