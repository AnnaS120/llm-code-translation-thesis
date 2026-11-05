N1 = 10
N2 = 1
N3 = 8
# -*- coding:utf-N3 -*-
import sys

a,b = N2,N2
l = range(N2,N1)
for i in l:
    for k in l:
        result = i*k
        print(i,end="")
        print('x',end="")
        print(k,end="")
        print('=',end="")
        print(i*k)