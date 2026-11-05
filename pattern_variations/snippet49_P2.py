hillheight = [53, 26, 93, 56, 67, 46, 82, 81, 44, 90]

for idx in range(0, 10):
    hillheight.append(int(hillheight.pop(0)))

hillheight.sort()

for idx in range(0, 3):
    print((hillheight[-1-idx]))