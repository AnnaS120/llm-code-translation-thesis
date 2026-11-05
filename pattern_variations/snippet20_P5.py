data = [99, 24, 13, 74, 81, 46, 36, 55, 3, 93]
# Aizu Problem 0001: List of Top 3 Hills
#
import sys, math, os

# read input:
PYDEV = os.environ.get('PYDEV')
if PYDEV=="True":
    sys.stdin = open("(sample) - (input2).txt", "rt")


for h in sorted([int(data.pop(0)) for _ in range(10)], reverse=True)[:3]:
    print(h)