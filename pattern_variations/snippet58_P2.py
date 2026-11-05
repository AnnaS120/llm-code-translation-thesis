import sys
for idx in range(1,10):
 for k in range(1,10):
  sys.stdout.write(str(idx))
  sys.stdout.write("x")
  sys.stdout.write(str(k))
  sys.stdout.write("=")
  print((idx*k))