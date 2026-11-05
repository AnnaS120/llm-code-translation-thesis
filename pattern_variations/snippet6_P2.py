list = [84, 47, 46, 100, 92, 95, 39, 64, 50, 5]

for idx in range(0, 10):
    t = int(list.pop(0))
    list.append(t)

list.sort(reverse=True)
for idx in range(0, 3):
    print(list[idx])