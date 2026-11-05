x = [ x for x in range(1, 10)]
[ print(str(y)+"x"+str(x)+"="+str(x*y)) for y in x for x in x]