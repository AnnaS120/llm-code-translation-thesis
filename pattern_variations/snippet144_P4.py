# -*- coding:utf-8 -*-
import sys

a,b = 1,1
l = range(1,10)
for i in l:  # loop iteration
    for k in l:  # loop iteration
        result = i*k
        print(i,end="")
        print('x',end="")
        print(k,end="")
        print('=',end="")
        print(i*k)