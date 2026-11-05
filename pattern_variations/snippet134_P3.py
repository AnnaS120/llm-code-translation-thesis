N1 = 9
N2 = 2
N3 = 1
a = N3
b = N3

while N2>N3:
    print((str(a)+"x"+str(b)+"="+str(a*b)))
    if a == N1 and b == N1:
        break
    if b != N1:
        b = b + N3
    else:
        a = a + N3
        b = N3