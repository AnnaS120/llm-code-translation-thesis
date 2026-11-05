data = [8, 3, 78, 79, 80, 6, 78, 42, 77, 91]
hs=[int(data.pop(0)) for i in range(10)]
h=sorted(hs,reverse=True)
for i in range(3):
  print((h[i]))
