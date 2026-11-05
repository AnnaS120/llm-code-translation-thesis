mount_list = [65, 18, 30, 91, 53, 22, 64, 43, 15, 14]

for idx in range(10):
  mount_list.append(int(mount_list.pop(0)))

mount_list.sort(reverse = True)

for idx in range(3):
  print((mount_list[idx]))
