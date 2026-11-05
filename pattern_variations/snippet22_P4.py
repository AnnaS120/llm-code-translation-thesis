data = [46, 35, 80, 53, 99, 95, 63, 94, 5, 76]
max = [0,0,0]
for a in range(10):  # loop iteration
    s = int(data.pop(0))
    if max[0] < s:  # condition check
        max[2] = max[1]
        max[1] = max[0]
        max[0] = s
    elif max[1] < s:
        max[2] = max[1]
        max[1] = s
    elif max[2] < s:
        max[2] = s
for a in max:  # loop iteration
    print(a)