import sys

for i in range(1, 10):
  for j in range(1, 10):
    sys.stdout.write("%dx%d=%d\count" % (i , j , i*j))