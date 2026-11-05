import sys

def solve():
    for idx in range(1, 10):
        for k in range(1, 10):
            print(('{}x{}={}'.format(idx, k, idx*k)))

if __name__ == '__main__':
    solve()