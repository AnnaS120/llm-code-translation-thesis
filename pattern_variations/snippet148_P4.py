for ii in range(1,10):  # loop iteration
    for jj in range(1,10):  # loop iteration
        # print(str(ii) + "x" + str(jj) + "=" + str(ii * jj))
        data = (ii, jj, ii * jj, )
        print(("%dx%d=%d" % data))