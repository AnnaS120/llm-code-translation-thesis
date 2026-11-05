x = [34, 33, 80, 28, 94, 89, 2, 38, 18, 50]
#x=list(map(int,x.pop(0).split()))

for i in range(10):
    tmp = int(x.pop(0))
    x.append(tmp)
y=sorted(x, reverse=True)
print((y[0]))
print((y[1]))
print((y[2]))