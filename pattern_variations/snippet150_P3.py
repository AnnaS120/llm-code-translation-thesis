N1 = 10
N2 = 1
import itertools
for i,j in itertools.product(list(range(N2,N1)), list(range(N2,N1))):
    print(('{}x{}={}'.format(i,j,i*j)))
