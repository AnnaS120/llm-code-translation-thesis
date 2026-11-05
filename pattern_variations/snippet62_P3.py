N1 = 9
N2 = 1
kukuo=[i+N2 for i in range(N1)]
for i in kukuo:
     for e in kukuo:
         print(("%ix%i=%i"%(i,e,i*e)))