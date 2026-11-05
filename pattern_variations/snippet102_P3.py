N1 = 10
N2 = 0
for i in range(N1):
    for j in range(N1):
        if(i > N2 and j > N2):
            print((str(i) + 'x' + str(j) + '=' + str(i*j)))