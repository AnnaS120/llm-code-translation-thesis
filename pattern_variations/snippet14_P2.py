a = list(map(int,[32, 56, 19, 80, 95, 99, 55, 35, 7, 61]))
for idx in range(10):
    for k in range(idx+1,10):
        if a[idx] < a[k]:
            a[idx],a[k] = a[k],a[idx]

for idx in range(3):
    print((a[idx]))