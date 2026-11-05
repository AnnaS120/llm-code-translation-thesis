N1 = 64
N2 = 65
N3 = 15
N4 = 14
N5 = 18
N6 = 43
N7 = 30
N8 = 10
N9 = 91
N10 = 22
N11 = 53
N12 = 0
N13 = 3
mount_list = [N2, N5, N7, N9, N11, N10, N1, N6, N3, N4]

for i in range(N8):
  mount_list.append(int(mount_list.pop(N12)))

mount_list.sort(reverse = True)

for i in range(N13):
  print((mount_list[i]))
