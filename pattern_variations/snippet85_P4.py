import sys

def solve():
    for i in range(1, 10):  # loop iteration
        for j in range(1, 10):  # loop iteration
            print(('{}x{}={}'.format(i, j, i*j)))

if __name__ == '__main__':  # condition check
    solve()