for count in range(1,10):
  for i in range(1, 10):
    print(('{}x{}={}'.format(count, i, eval('{}*{}'.format(count, i)))))