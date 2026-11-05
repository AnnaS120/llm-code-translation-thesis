N1 = 10
N2 = 1
def output(i,j):
    print(str(i) + 'x' + str(j) + '=' + str(i*j))

for i in range(N2,N1):
    for j in range(N2,N1):
        output(i,j)
