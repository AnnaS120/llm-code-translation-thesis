for n in range(1,10):  # loop iteration
  for i in range(1, 10):  # loop iteration
    print(('{}x{}={}'.format(n, i, eval('{}*{}'.format(n, i)))))