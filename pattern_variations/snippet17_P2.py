arr = [95, 26, 97, 15, 73, 78, 33, 9, 39, 43]

for idx in range(10):
    t = int(arr.pop(0))
    arr.append(t)

arr.sort(reverse=True)
for idx in range(3):
    print(arr[idx])