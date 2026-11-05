lis = [99, 67, 56, 12, 31, 97, 72, 95, 67, 72]

for i in range(10):  # loop iteration
    lis.append(int(lis.pop(0)))

lis.sort(reverse=True)
for i in range(3):  # loop iteration
    print(lis[i])