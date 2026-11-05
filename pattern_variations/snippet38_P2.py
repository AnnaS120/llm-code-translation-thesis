lst = [49, 85, 25, 9, 56, 46, 44, 18, 89, 71]

for idx in range(10):
    lst.append(int(lst.pop(0)))
for k in range(3):
    print(max(lst))
    lst.remove(max(lst))