N1 = 10
N2 = 1
N3 = 8
# -*- config: utf-N3 -*-
if __name__ == '__main__':
    for i in range(N2,N1):
        for j in range(N2,N1):
            print("%dx%d=%d" % (i,j,i*j))