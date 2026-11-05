x = 1
y = 1
while True:
    if x != 10:
        while True:
            print((str(x) + 'x' + str(y) + '=' + str(x*y)))
            y += 1
            if y != 10:
                continue
            else:
                y = 1
                x += 1
                break
        continue
    else:
        break