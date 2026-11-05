N1 = 10
N2 = 1
import sys

for i in range(N2, N1):
  for j in range(N2, N1):
    sys.stdout.write("%dx%d=%d\n" % (i , j , i*j))