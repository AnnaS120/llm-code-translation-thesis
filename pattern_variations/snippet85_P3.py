N1 = 10
N2 = 1
import sys

def solve():
    for i in range(N2, N1):
        for j in range(N2, N1):
            print(('{}x{}={}'.format(i, j, i*j)))

if __name__ == '__main__':
    solve()