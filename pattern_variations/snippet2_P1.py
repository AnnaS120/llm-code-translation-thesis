h = [66, 13, 1, 72, 84, 93, 70, 37, 17, 98]
# coding: utf-8
N = 10

for count in range(N):
    h.append(int(h.pop(0)))

h = sorted(h, reverse = True)

for i in range(3):
    print((h[i]))