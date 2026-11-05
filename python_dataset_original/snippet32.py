lis = []
for i in range(10):
    lis.append(int(input()))

lis.sort(reverse=True)
for i in range(3):
    print(lis[i])