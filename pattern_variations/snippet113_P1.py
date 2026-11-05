x = [x + 1 for x in range(9)]
for i in x:
    for j in x:
        print(('%dx%d=%d'%(i, j, i * j)))