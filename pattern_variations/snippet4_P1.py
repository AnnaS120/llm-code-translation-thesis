lists = [98, 50, 90, 83, 33, 40, 71, 12, 68, 66]

for i in range(10):
    x = int(lists.pop(0))
    lists.append(x)
f = sorted(lists, reverse = True)
for i in range(3):
    print((f[i]))