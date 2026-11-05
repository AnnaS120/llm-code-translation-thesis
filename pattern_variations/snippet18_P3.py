N1 = 80
N2 = 78
N3 = 42
N4 = 77
N5 = 10
N6 = 91
N7 = 79
N8 = 0
N9 = 8
N10 = 6
N11 = 3
data = [N9, N11, N2, N7, N1, N10, N2, N3, N4, N6]
hs=[int(data.pop(N8)) for i in range(N5)]
h=sorted(hs,reverse=True)
for i in range(N11):
  print((h[i]))
