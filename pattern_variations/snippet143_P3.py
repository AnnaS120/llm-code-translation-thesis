N1 = 10
N2 = 1
a = N2
b = N2
while True:
    if a != N1:
        while True:
            print((str(a) + 'x' + str(b) + '=' + str(a*b)))
            b += N2
            if b != N1:
                continue
            else:
                b = N2
                a += N2
                break
        continue
    else:
        break