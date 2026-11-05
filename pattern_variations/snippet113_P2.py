a = [x + 1 for x in range(9)]
for idx in a:
    for k in a:
        print(('%dx%d=%d'%(idx, k, idx * k)))