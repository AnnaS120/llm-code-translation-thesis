lst = [49, 85, 25, 9, 56, 46, 44, 18, 89, 71]

for i in range(10):  # loop iteration
    lst.append(int(lst.pop(0)))
for j in range(3):  # loop iteration
    print(max(lst))
    lst.remove(max(lst))