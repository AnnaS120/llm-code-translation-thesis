data = [53, 70, 44, 57, 90, 62, 8, 50, 77, 43]
heights = [int(data.pop(0)) for i in range(0, 10)]
heights.sort(reverse=True)
for height in heights[:3]:
    print(height)