from itertools import product
from operator import mul

for v in [(x[0], x[1], mul(*x)) for x in product(list(range(1, 10)), repeat=2)]:
    print(("{}x{}={}".format(*v)))