height_li = [38, 92, 94, 78, 43, 54, 8, 47, 38, 60]
import sys

for idx in range(10):
    height_li.append(int(height_li.pop(0)))
for idx in range(3):
    print((sorted(height_li,reverse=True)[idx]))