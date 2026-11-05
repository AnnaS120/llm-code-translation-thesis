N1 = 9
N2 = 1
a=N2
for j in range(N1):
    b=N2
    for i in range(N1):
        print(a,('x'),b,('='),a*b,sep='')
        b=b+N2
    a=a+N2
