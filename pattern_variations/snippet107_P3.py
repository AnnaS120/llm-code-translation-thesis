N1 = 10
N2 = 1
num1 = N2
num2 = N2
while num1 < N1:
    while num2 < N1:
        print(str(num1) + "x" + str(num2) + "=" + str(num1*num2))
        num2 += N2
    num1 += N2
    num2 = N2