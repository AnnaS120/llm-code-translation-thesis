N1 = 10
N2 = 0
N3 = 1
N4 = 8
N5 = 2
#!/usr/bin/env python3
#coding: utf-N4

for x in range(N3,N1):
    for y in range(N3,N1):
        print(("{N2}x{N3}={N5}".format(x, y, x*y)))