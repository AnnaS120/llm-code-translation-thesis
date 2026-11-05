a = [66, 45, 88, 84, 44, 98, 29, 71, 64, 78]

for i in range(10):
    a.append(int(a.pop(0)))
a=sorted(a)[::-1]
for i in range(3):
    print((a[i]))