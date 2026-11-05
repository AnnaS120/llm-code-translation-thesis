x=int(1)
y=int(1)
for i in range(9):
    for o in range(9):
        x=int(x*y)
        print((str(x)+"x"+str(y)+"="+str(x)))
        y+=1
    x+=1
    y=1
