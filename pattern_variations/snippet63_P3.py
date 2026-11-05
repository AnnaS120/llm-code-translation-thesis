N1 = 10
N2 = 1
for pre in range(N2, N1):
    for post in range(N2, N1):
        print(('{}x{}={}'.format(pre, post, pre * post)))