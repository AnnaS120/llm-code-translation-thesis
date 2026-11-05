N1 = 50
N2 = 80
N3 = 34
N4 = 28
N5 = 94
N6 = 38
N7 = 18
N8 = 10
N9 = 33
N10 = 89
N11 = 0
N12 = 1
N13 = 2
a = [N3, N9, N2, N4, N5, N10, N13, N6, N7, N1]
#a=list(map(int,a.pop(N11).split()))

for i in range(N8):
    tmp = int(a.pop(N11))
    a.append(tmp)
b=sorted(a, reverse=True)
print((b[N11]))
print((b[N12]))
print((b[N13]))