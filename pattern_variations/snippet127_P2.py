for idx in range (9):
    for k in range(9):
        idx=idx+1
        k=k+1
        k=idx*k
        print((str(idx)+"x"+str(k)+"="+str(k)))
        idx=idx-1
        k=k-1