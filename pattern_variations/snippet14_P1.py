x = list(map(int,[32, 56, 19, 80, 95, 99, 55, 35, 7, 61]))
for i in range(10):
    for j in range(i+1,10):
        if x[i] < x[j]:
            x[i],x[j] = x[j],x[i]

for i in range(3):
    print((x[i]))