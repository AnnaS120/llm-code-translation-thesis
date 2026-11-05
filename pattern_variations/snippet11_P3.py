N1 = 48
N2 = 50
N3 = 47
N4 = 40
N5 = 28
N6 = 63
N7 = 10
N8 = 90
N9 = 84
N10 = 68
N11 = 9
N12 = 0
N13 = 1
N14 = 2
data = [N11, N1, N4, N2, N6, N10, N5, N3, N8, N9]

for i in range(N7):
    data.append(int(data.pop(N12)))

data.sort(reverse = True)
print(data[N12])
print(data[N13])
print(data[N14])