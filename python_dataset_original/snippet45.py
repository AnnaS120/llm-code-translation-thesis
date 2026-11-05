height=[]
for i in range(10):
    mountain=int(input())
    height.append(mountain)
height.sort()
height.reverse()
for i in range(3):
    print((height[i]))