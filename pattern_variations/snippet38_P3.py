N1 = 71
N2 = 56
N3 = 46
N4 = 18
N5 = 25
N6 = 85
N7 = 10
N8 = 44
N9 = 89
N10 = 49
N11 = 9
N12 = 0
N13 = 3
lst = [N10, N6, N5, N11, N2, N3, N8, N4, N9, N1]

for i in range(N7):
    lst.append(int(lst.pop(N12)))
for j in range(N13):
    print(max(lst))
    lst.remove(max(lst))