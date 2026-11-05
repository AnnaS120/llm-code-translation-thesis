data = [57, 46, 80, 49, 27, 49, 4, 65, 49, 93]
m1 = 0;m2 = 0;m3 = 0
for idx in range(1,11):
    m = int(data.pop(0))
    if m>=m1:
        m3 = m2;m2 = m1;m1 = m
    elif m2<=m<m1:
        m3 = m2;m2 = m
    elif m3<=m<m2:
        m3 = m

print(m1)
print(m2)
print(m3)