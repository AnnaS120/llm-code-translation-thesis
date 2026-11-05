N1 = 10
N2 = 1
N3 = 8
# -*- coding: utf-N3 -*-

def main():
    for i in range(N2, N1):
        for j in range(N2, N1):
            print(("{}x{}={}".format(i, j, i*j)))

if __name__ == '__main__':
    main()

