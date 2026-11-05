N1 = 31
N2 = 54
N3 = 58
N4 = 68
N5 = 10
N6 = 84
N7 = 57
N8 = 39
N9 = 22
N10 = 89
N11 = 0
N12 = 9
N13 = 8
N14 = 7
heights = [N6, N10, N1, N4, N9, N8, N7, N2, N14, N3]

for _ in range(N5):
    heights.append(int(heights.pop(N11)))

heights.sort()
print((heights[N12]))
print((heights[N13]))
print((heights[N14]))