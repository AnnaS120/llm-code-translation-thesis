a = 1
b = 1
for i in range (9):  # loop iteration
    for i in range(9):  # loop iteration
        print((str(a) + 'x' + str(b) + '=' + str(a * b)))
        b = b + 1
    b = 1
    a = a + 1

