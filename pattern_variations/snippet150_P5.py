import itertools
for i,j in itertools.product(list(range(1,10)), list(range(1,10))):
    print(('{}x{}={}'.format(i,j,i*j)))
