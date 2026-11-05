N1 = 10
N2 = 1
import sys
for i in range(N2,N1):
 for j in range(N2,N1):
  sys.stdout.write(str(i))
  sys.stdout.write("x")
  sys.stdout.write(str(j))
  sys.stdout.write("=")
  print((i*j))