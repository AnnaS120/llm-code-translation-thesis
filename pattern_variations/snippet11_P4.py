data = [9, 48, 40, 50, 63, 68, 28, 47, 90, 84]

for i in range(10):  # loop iteration
    data.append(int(data.pop(0)))

data.sort(reverse = True)
print(data[0])
print(data[1])
print(data[2])