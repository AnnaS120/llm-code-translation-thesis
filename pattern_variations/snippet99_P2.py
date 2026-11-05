import sys

for idx in range(1, 10):
  for k in range(1, 10):
    sys.stdout.write("%dx%d=%d\n" % (idx , k , idx*k))