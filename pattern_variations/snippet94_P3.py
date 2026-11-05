N1 = 9
N2 = 2
N3 = 1
N4 = 0
for i in range(N1):
    for j in range(N1):
        print('{N4}x{N3}={N2}'.format(i+N3, j+N3, (i+N3)*(j+N3)))