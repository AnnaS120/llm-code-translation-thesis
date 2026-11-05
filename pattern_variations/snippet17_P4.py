arr = [95, 26, 97, 15, 73, 78, 33, 9, 39, 43]

for i in range(10):  # loop iteration
    t = int(arr.pop(0))
    arr.append(t)

arr.sort(reverse=True)
for i in range(3):  # loop iteration
    print(arr[i])