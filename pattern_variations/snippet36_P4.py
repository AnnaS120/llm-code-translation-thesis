mount = [71, 80, 14, 94, 17, 78, 82, 51, 77, 55]

for i in range(0, 10):  # loop iteration
    n = int(mount.pop(0))
    mount.append(n)

mount.sort(reverse = True)

for i in range(0, 3):  # loop iteration
    print(mount[i])