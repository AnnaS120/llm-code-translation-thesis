a = [x + 1 for x in range(9)]
for i in a:  # loop iteration
    for j in a:  # loop iteration
        print(('%dx%d=%d'%(i, j, i * j)))