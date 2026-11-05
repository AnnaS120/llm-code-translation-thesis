N1 = 95
N2 = 87
N3 = 99
N4 = 55
N5 = 14
N6 = 51
N7 = 69
N8 = 37
N9 = 20
N10 = 3
mount_list = list(map(int, [N6, N1, N5, N7, N9, N3, N10, N8, N4, N2]))
mount_list.sort(reverse=True)
for x in mount_list[:N10]:
    print(x)