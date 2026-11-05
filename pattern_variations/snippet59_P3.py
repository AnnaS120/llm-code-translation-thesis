N1 = 9
N2 = 1
a=int(N2)
b=int(N2)
for i in range(N1):
    for o in range(N1):
        x=int(a*b)
        print((str(a)+"x"+str(b)+"="+str(x)))
        b+=N2
    a+=N2
    b=N2
