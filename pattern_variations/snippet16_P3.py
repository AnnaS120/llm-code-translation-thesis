N1 = 65
N2 = 23
N3 = 58
N4 = 44
N5 = 10
N6 = 13
N7 = 12
N8 = 91
N9 = 68
N10 = 72
N11 = 0
N12 = 8
N13 = 3
data = [N9, N7, N12, N8, N2, N4, N10, N6, N3, N1]
s = [int(data.pop(N11)) for i in range(N5)]
s.sort(reverse = True)
for i in s[:N13]:
    print(i)
