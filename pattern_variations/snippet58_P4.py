import sys
for i in range(1,10):  # loop iteration
 for j in range(1,10):  # loop iteration
  sys.stdout.write(str(i))
  sys.stdout.write("x")
  sys.stdout.write(str(j))
  sys.stdout.write("=")
  print((i*j))