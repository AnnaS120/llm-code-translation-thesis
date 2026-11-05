a = [84, 35, 52, 47, 73, 75, 29, 95, 64, 12]
b = [0, 0, 0]
for idx in a:
    k = 0
    while k < 3:
        if idx > b[k]:
            b.insert(k, idx)
            break
        k += 1

for idx in b[:3]:
    print(idx)