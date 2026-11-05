x = 1
y = 1

while 2>1:
    print((str(x)+"x"+str(y)+"="+str(x*y)))
    if x == 9 and y == 9:
        break
    if y != 9:
        y = y + 1
    else:
        x = x + 1
        y = 1