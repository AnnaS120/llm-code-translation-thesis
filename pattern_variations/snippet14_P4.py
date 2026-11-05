a = list(map(int,[32, 56, 19, 80, 95, 99, 55, 35, 7, 61]))
for i in range(10):  # loop iteration
    for j in range(i+1,10):  # loop iteration
        if a[i] < a[j]:  # condition check
            a[i],a[j] = a[j],a[i]

for i in range(3):  # loop iteration
    print((a[i]))