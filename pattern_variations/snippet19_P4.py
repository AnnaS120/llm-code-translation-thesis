l = [60, 9, 26, 7, 35, 49, 78, 78, 32, 53]

for _ in range(10):  # loop iteration
    l.append(int(l.pop(0)))
l.sort(reverse=True)
print(l[0])
print(l[1])
print(l[2])