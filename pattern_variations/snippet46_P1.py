x = [66, 45, 88, 84, 44, 98, 29, 71, 64, 78]

for i in range(10):
    x.append(int(x.pop(0)))
x=sorted(x)[::-1]
for i in range(3):
    print((x[i]))