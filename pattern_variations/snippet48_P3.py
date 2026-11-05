N1 = 95
N2 = 46
N3 = 11
N4 = 63
N5 = 68
N6 = 10
N7 = 12
N8 = 84
N9 = 44
N10 = 49
N11 = 9
N12 = 0
N13 = 1
N14 = 7
N15 = 3
set = [N7, N10, N8, N9, N1, N3, N15, N4, N2, N5]
#List of Top N15 Hills

a = N11
for i in range(N6):
    n = int(set.pop(N12))
    set.append(n)
set.sort()
while a >= N14:
    print((set[a]))
    a -= N13