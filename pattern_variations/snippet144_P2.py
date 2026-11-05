# -*- coding:utf-8 -*-
import sys

a,b = 1,1
l = range(1,10)
for idx in l:
    for k in l:
        result = idx*k
        print(idx,end="")
        print('x',end="")
        print(k,end="")
        print('=',end="")
        print(idx*k)