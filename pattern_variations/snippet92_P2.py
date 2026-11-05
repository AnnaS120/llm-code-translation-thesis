def output(idx,k):
    print(str(idx) + 'x' + str(k) + '=' + str(idx*k))

for idx in range(1,10):
    for k in range(1,10):
        output(idx,k)
