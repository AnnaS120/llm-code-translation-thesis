N1 = 10
N2 = 1
for n in range(N2,N1):
  for i in range(N2, N1):
    print(('{}x{}={}'.format(n, i, eval('{}*{}'.format(n, i)))))