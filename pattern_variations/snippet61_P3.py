N1 = 10
N2 = 1
a = [ x for x in range(N2, N1)]
[ print(str(y)+"x"+str(x)+"="+str(x*y)) for y in a for x in a]