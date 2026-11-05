x = [77, 14, 37, 91, 13, 41, 35, 72, 23, 38]

for i in range(1,11):
    y=int(x.pop(0))
    x.append(y)
x.sort(reverse=True)
for i in range(3):
    print((x[i]))