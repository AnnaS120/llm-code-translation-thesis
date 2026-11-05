N1 = 99
N2 = 31
N3 = 28
N4 = 92
N5 = 62
N6 = 10
N7 = 12
N8 = 66
N9 = 22
N10 = 0
N11 = 7
N12 = 3
height_list = [N4, N3, N5, N2, N9, N8, N1, N11, N7, N3]

for i in range(N6):
    height_list.append(height_list.pop(N10))
height_list.sort()
height_list.reverse()

for height in height_list[:N12]:
    print(height)