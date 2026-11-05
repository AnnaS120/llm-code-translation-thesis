N1 = 10
N2 = 0
N3 = 2
N4 = 1
from itertools import product
from operator import mul

for v in [(x[N2], x[N4], mul(*x)) for x in product(list(range(N4, N1)), repeat=N3)]:
    print(("{}x{}={}".format(*v)))