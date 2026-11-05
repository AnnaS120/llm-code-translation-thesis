data = [42, 93, 15, 24, 5, 5, 74, 40, 46, 52]
# coding: utf-8

#Name: List of Top 3 Hills
#Level: 1
#Category: ????????????
#Note:

s = [int(data.pop(0)) for i in range(10)]

s.sort()

for i in range(3):
    print(s[9-i])