N1 = 9
N2 = 1
a = [x + N2 for x in range(N1)]
for i in a:
    for j in a:
        print(('%dx%d=%d'%(i, j, i * j)))