a = [84, 35, 52, 47, 73, 75, 29, 95, 64, 12]
b = [0, 0, 0]
for i in a:
    j = 0
    while j < 3:
        if i > b[j]:
            b.insert(j, i)
            break
        j += 1

for i in b[:3]:
    print(i)