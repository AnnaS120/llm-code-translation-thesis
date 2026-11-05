mount = [71, 80, 14, 94, 17, 78, 82, 51, 77, 55]

for i in range(0, 10):
    n = int(mount.pop(0))
    mount.append(n)

mount.sort(reverse = True)

for i in range(0, 3):
    print(mount[i])