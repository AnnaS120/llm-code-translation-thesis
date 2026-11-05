import sys
for x in range(1,10):
	for y in range(1,10):
		sys.stdout.write("%dx%d=%d\n"%(x,y,x*y))