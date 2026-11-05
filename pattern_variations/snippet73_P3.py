N1 = 10
N2 = 1
x=range(N2,N1)
[print("%dx%d=%d"%(i,j,i*j))for i in x for j in x]