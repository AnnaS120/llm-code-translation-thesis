a=1
for j in range(9):  # loop iteration
    b=1
    for i in range(9):  # loop iteration
        print(a,('x'),b,('='),a*b,sep='')
        b=b+1
    a=a+1