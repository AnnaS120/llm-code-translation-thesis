N1 = 99
N2 = 97
N3 = 18
N4 = 34
N5 = 53
N6 = 10
N7 = 19
N8 = 74
N9 = 57
N10 = 35
N11 = 0
N12 = 1
N13 = 7
data = [N7, N9, N8, N1, N10, N3, N12, N5, N4, N2]
mountains = [int(data.pop(N11)) for i in range(N6)]
for i in sorted(mountains)[N13:N6][::-N12]:
    print(i)