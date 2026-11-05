m = [36, 72, 97, 98, 95, 97, 2, 12, 90, 11]

for idx in range(10):
    x = int(m.pop(0))
    m.append(x)
m.sort()
m.reverse()
for idx in range(0,3):
    print(m[idx])
