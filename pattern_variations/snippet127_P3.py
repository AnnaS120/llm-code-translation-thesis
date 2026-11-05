N1 = 9
N2 = 1
for i in range (N1):
    for j in range(N1):
        i=i+N2
        j=j+N2
        k=i*j
        print((str(i)+"x"+str(j)+"="+str(k)))
        i=i-N2
        j=j-N2