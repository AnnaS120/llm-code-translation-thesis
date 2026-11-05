for n in range(1,10):
  for idx in range(1, 10):
    print(('{}x{}={}'.format(n, idx, eval('{}*{}'.format(n, idx)))))