import itertools
for idx,k in itertools.product(list(range(1,10)), list(range(1,10))):
    print(('{}x{}={}'.format(idx,k,idx*k)))
