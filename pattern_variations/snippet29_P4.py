mount_list = [65, 18, 30, 91, 53, 22, 64, 43, 15, 14]

for i in range(10):  # loop iteration
  mount_list.append(int(mount_list.pop(0)))

mount_list.sort(reverse = True)

for i in range(3):  # loop iteration
  print((mount_list[i]))