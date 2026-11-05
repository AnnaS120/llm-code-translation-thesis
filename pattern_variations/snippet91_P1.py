x = [1,2,3,4,5,6,7,8,9]
y = [1,2,3,4,5,6,7,8,9]
for i in range(9):
  for j in range(9):
    print(('{}x{}={}'.format(x[i],y[j],x[i]*y[j])))
