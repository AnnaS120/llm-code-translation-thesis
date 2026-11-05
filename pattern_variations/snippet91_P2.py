a = [1,2,3,4,5,6,7,8,9]
b = [1,2,3,4,5,6,7,8,9]
for idx in range(9):
  for k in range(9):
    print(('{}x{}={}'.format(a[idx],b[k],a[idx]*b[k])))
