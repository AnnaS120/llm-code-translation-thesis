x = [84, 35, 52, 47, 73, 75, 29, 95, 64, 12]
y = [0, 0, 0]
for i in x:
    j = 0
    while j < 3:
        if i > y[j]:
            y.insert(j, i)
            break
        j += 1

for i in y[:3]:
    print(i)