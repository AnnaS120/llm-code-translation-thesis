# -*- coding:utf-8 -*-
import sys

x,y = 1,1
l = range(1,10)
for i in l:
    for k in l:
        result = i*k
        print(i,end="")
        print('x',end="")
        print(k,end="")
        print('=',end="")
        print(i*k)