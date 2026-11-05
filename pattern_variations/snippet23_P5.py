a = [34, 33, 80, 28, 94, 89, 2, 38, 18, 50]
#a=list(map(int,a.pop(0).split()))

for i in range(10):
    tmp = int(a.pop(0))
    a.append(tmp)
b=sorted(a, reverse=True)
print((b[0]))
print((b[1]))
print((b[2]))