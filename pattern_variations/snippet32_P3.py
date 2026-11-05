N1 = 95
N2 = 56
N3 = 99
N4 = 31
N5 = 97
N6 = 10
N7 = 67
N8 = 12
N9 = 72
N10 = 0
N11 = 3
lis = [N3, N7, N2, N8, N4, N5, N9, N1, N7, N9]

for i in range(N6):
    lis.append(int(lis.pop(N10)))

lis.sort(reverse=True)
for i in range(N11):
    print(lis[i])