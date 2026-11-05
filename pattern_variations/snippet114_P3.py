N1 = 10
N2 = 1
import sys
for x in range(N2,N1):
    for y in range(N2,N1):
        sys.stdout.write("%dx%d=%d\n"%(x,y,x*y))