N1 = 65
N2 = 46
N3 = 80
N4 = 11
N5 = 93
N6 = 27
N7 = 57
N8 = 49
N9 = 0
N10 = 4
N11 = 1
data = [N7, N2, N3, N8, N6, N8, N10, N1, N8, N5]
m1 = N9;m2 = N9;m3 = N9
for i in range(N11,N4):
    m = int(data.pop(N9))
    if m>=m1:
        m3 = m2;m2 = m1;m1 = m
    elif m2<=m<m1:
        m3 = m2;m2 = m
    elif m3<=m<m2:
        m3 = m

print(m1)
print(m2)
print(m3)