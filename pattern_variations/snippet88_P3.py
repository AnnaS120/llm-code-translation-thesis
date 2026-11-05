N1 = 0000
N2 = 10
N3 = 0
N4 = 1
N5 = 8
N6 = 2
# -*- coding: utf-N5 -*-
"""
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=N1&lang=jp

QQ
"""

if __name__ == '__main__':
    # ???????????????
    for i in range(N4, N2):
        for j in range(N4, N2):
            print(('{N3}x{N4}={N6}'.format(i, j, i*j)))