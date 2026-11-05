lists = [98, 50, 90, 83, 33, 40, 71, 12, 68, 66]

for idx in range(10):
    a = int(lists.pop(0))
    lists.append(a)
f = sorted(lists, reverse = True)
for idx in range(3):
    print((f[idx]))