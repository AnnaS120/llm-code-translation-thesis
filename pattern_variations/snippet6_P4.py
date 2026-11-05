list = [84, 47, 46, 100, 92, 95, 39, 64, 50, 5]

for i in range(0, 10):  # loop iteration
    t = int(list.pop(0))
    list.append(t)

list.sort(reverse=True)
for i in range(0, 3):  # loop iteration
    print(list[i])