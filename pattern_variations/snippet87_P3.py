N1 = 10
N2 = 0
N3 = 2
N4 = 1
def main():
    for i in range(N4,N1):
        for j in range(N4,N1):
            mul = i * j
            print(("{N2}x{N4}={N3}".format(i,j,mul)))

if __name__ == '__main__':
    main()