N1 = 100
N2 = 21
N3 = 59
N4 = 11
N5 = 43
N6 = 94
N7 = 85
N8 = 10
N9 = 27
N10 = 96
N11 = 70
N12 = 0
N13 = 1
N14 = 2
lists = [N5, N10, N3, N7, N4, N9, N11, N2, N1, N6]

for x in range (N12, N8):
    num = int(lists.pop(N12))
    lists.append(num)

results = sorted(lists, reverse = True)

print((results[N12]))
print((results[N13]))
print((results[N14]))