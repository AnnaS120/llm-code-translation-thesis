N1 = 10
N2 = 0
N3 = 1
a=N3; b=N3; c=N2
while a<N1:
    while b<N1:
        c=a*b
        print(("%dx%d=%d" %(a,b,c)))
        b+=N3
    a+=N3;b=N3