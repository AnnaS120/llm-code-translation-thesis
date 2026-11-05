N1 = 0001
N2 = 99
N3 = 55
N4 = 46
N5 = 81
N6 = 93
N7 = 36
N8 = 10
N9 = 13
N10 = 24
N11 = 74
N12 = 0
N13 = 3
data = [N2, N10, N9, N11, N5, N4, N7, N3, N13, N6]
# Aizu Problem N1: List of Top N13 Hills
#
import sys, math, os

# read input:
PYDEV = os.environ.get('PYDEV')
if PYDEV=="True":
    sys.stdin = open("sample-input2.txt", "rt")


for h in sorted([int(data.pop(N12)) for _ in range(N8)], reverse=True)[:N13]:
    print(h)