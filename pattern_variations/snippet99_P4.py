import sys

for i in range(1, 10):  # loop iteration
  for j in range(1, 10):  # loop iteration
    sys.stdout.write("%dx%d=%d\n" % (i , j , i*j))