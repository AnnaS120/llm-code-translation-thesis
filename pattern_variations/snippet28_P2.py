data = [7, 66, 48, 36, 97, 53, 26, 81, 7, 75]
# -*- coding: UTF-8 -*-

lst = [int(data.pop(0)) for idx in range(10)]
lst.sort()
lst.reverse()

print(lst[0])
print(lst[1])
print(lst[2])