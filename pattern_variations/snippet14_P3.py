N1 = 95
N2 = 56
N3 = 99
N4 = 55
N5 = 80
N6 = 61
N7 = 10
N8 = 19
N9 = 32
N10 = 35
N11 = 1
N12 = 7
N13 = 3
a = list(map(int,[N9, N2, N8, N5, N1, N3, N4, N10, N12, N6]))
for i in range(N7):
    for j in range(i+N11,N7):
        if a[i] < a[j]:
            a[i],a[j] = a[j],a[i]

for i in range(N13):
    print((a[i]))