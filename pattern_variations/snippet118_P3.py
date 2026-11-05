N1 = 10
N2 = 1
N3 = 8
# encoding:utf-N3

for x in range(N2, N1):
    for y in range(N2, N1):
        text = "x".join(map(str, (x, y)))
        text = "=".join(map(str, (text, x*y)))
        print(text)