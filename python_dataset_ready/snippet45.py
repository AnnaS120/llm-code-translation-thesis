height = [97, 45, 67, 24, 72, 68, 60, 82, 28, 98]

for i in range(10):
    mountain=int(height.pop(0))
    height.append(mountain)
height.sort()
height.reverse()
for i in range(3):
    print((height[i]))