N1 = 10
N2 = 0
N3 = 1
N4 = 8
# -*- coding:utf-N4 -*-

def main():
    i=N2
    j=N2

    for i in range(N3,N1):
        for j in range(N3,N1):
            print((str(i)+"x"+str(j)+"="+str(i*j)))

if __name__ == '__main__':
    main()