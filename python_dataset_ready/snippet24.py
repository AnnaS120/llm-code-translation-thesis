height_list = [92, 28, 62, 31, 22, 66, 99, 7, 12, 28]

for i in range(10):
    height_list.append(height_list.pop(0))
height_list.sort()
height_list.reverse()

for height in height_list[:3]:
    print(height)