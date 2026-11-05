arr = [3, 54, 57, 45, 93, 98, 80, 100, 58, 96]

for i in range(10):
    arr.append(int(arr.pop(0)))

arr.sort(reverse=True)

for i in range(3):
    print(arr[i])
