set = [12, 49, 84, 44, 95, 11, 3, 63, 46, 68]
#List of Top 3 Hills

a = 9
for i in range(10):
    n = int(set.pop(0))
    set.append(n)
set.sort()
while a >= 7:
    print((set[a]))
    a -= 1