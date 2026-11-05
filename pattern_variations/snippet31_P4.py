heights = [84, 89, 31, 68, 22, 39, 57, 54, 7, 58]

for _ in range(10):  # loop iteration
    heights.append(int(heights.pop(0)))

heights.sort()
print((heights[9]))
print((heights[8]))
print((heights[7]))