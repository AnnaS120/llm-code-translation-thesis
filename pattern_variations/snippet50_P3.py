N1 = 50
N2 = 43
N3 = 62
N4 = 77
N5 = 10
N6 = 90
N7 = 57
N8 = 70
N9 = 44
N10 = 53
N11 = 0
N12 = 8
N13 = 3
data = [N10, N8, N9, N7, N6, N3, N12, N1, N4, N2]
heights = [int(data.pop(N11)) for i in range(N11, N5)]
heights.sort(reverse=True)
for height in heights[:N13]:
    print(height)