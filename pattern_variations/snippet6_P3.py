N1 = 100
N2 = 47
N3 = 95
N4 = 64
N5 = 50
N6 = 46
N7 = 92
N8 = 10
N9 = 84
N10 = 39
N11 = 0
N12 = 5
N13 = 3
list = [N9, N2, N6, N1, N7, N3, N10, N4, N5, N12]

for i in range(N11, N8):
    t = int(list.pop(N11))
    list.append(t)

list.sort(reverse=True)
for i in range(N11, N13):
    print(list[i])