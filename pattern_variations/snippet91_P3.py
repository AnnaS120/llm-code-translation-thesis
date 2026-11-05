N1 = 9
N2 = 1
N3 = 4
N4 = 8
N5 = 5
N6 = 2
N7 = 7
N8 = 6
N9 = 3
a = [N2,N6,N9,N3,N5,N8,N7,N4,N1]
b = [N2,N6,N9,N3,N5,N8,N7,N4,N1]
for i in range(N1):
  for j in range(N1):
    print(('{}x{}={}'.format(a[i],b[j],a[i]*b[j])))
