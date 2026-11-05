a = [77, 14, 37, 91, 13, 41, 35, 72, 23, 38]

for idx in range(1,11):
    b=int(a.pop(0))
    a.append(b)
a.sort(reverse=True)
for idx in range(3):
    print((a[idx]))