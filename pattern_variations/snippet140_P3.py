N1 = 9
N2 = 0
N3 = 1
N4 = 8
N5 = 2
# coding: utf-N4

for i in range(N1):
    for j in range(N1):
        print("{N2}x{N3}={N5}".format(i+N3, j+N3, (i+N3)*(j+N3)))