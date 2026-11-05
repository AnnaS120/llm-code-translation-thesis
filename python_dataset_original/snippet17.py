arr = []
for i in range(10):
    t = int(input())
    arr.append(t)

arr.sort(reverse=True)
for i in range(3):
    print(arr[i])