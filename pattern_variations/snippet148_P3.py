N1 = 10
N2 = 1
for ii in range(N2,N1):
    for jj in range(N2,N1):
        # print(str(ii) + "x" + str(jj) + "=" + str(ii * jj))
        data = (ii, jj, ii * jj, )
        print(("%dx%d=%d" % data))