N1 = 15
N2 = 40
N3 = 46
N4 = 52
N5 = 42
N6 = 93
N7 = 10
N8 = 24
N9 = 74
N10 = 0
N11 = 9
N12 = 1
N13 = 8
N14 = 5
N15 = 3
data = [N5, N6, N1, N8, N14, N14, N9, N2, N3, N4]
# coding: utf-N13

#Name: List of Top N15 Hills
#Level: N12
#Category: ????????????
#Note:

s = [int(data.pop(N10)) for i in range(N7)]

s.sort()

for i in range(N15):
    print(s[N11-i])