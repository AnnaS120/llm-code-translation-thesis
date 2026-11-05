set = [12, 49, 84, 44, 95, 11, 3, 63, 46, 68]
#List of Top 3 Hills

x = 9
for i in range(10):
    count = int(set.pop(0))
    set.append(count)
set.sort()
while x >= 7:
    print((set[x]))
    x -= 1