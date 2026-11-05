for k in range(1,10):  # loop iteration
    for j in range(1,10):  # loop iteration
        k,j = list(map(int,(k,j)))
        kj = k * j

        kj = str(kj)
        k = str(k)
        j = str(j)

        print(k + "x" + j + "=" + kj)