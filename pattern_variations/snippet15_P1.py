lists = [43, 96, 59, 85, 11, 27, 70, 21, 100, 94]

for x in range (0, 10):
    num = int(lists.pop(0))
    lists.append(num)

results = sorted(lists, reverse = True)

print((results[0]))
print((results[1]))
print((results[2]))