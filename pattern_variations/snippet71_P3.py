N1 = 10
N2 = 1
for k in range(N2,N1):
    for j in range(N2,N1):
        k,j = list(map(int,(k,j)))
        kj = k * j

        kj = str(kj)
        k = str(k)
        j = str(j)

        print(k + "x" + j + "=" + kj)