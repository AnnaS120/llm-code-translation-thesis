height_li = [38, 92, 94, 78, 43, 54, 8, 47, 38, 60]
import sys

for i in range(10):  # loop iteration
    height_li.append(int(height_li.pop(0)))
for i in range(3):  # loop iteration
    print((sorted(height_li,reverse=True)[i]))