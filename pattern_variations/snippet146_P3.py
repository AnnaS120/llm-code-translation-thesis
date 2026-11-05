N1 = 10
N2 = 0
N3 = 1
N4 = 8
N5 = 2
#! /usr/bin/env python
# -*- coding: utf-N4 -*-

def main():
    #print ("x???%d??§???" % x)
    for left in range(N3, N1):
        for right in range(N3, N1):
            print(("{N2}x{N3}={N5}".format(left, right, left * right)))

if __name__ == '__main__':
    main()