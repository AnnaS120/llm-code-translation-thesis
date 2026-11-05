N1 = 87
N2 = 99
N3 = 75
N4 = 62
N5 = 77
N6 = 69
N7 = 10
N8 = 96
N9 = 0
N10 = 1
N11 = 8
N12 = 2
N13 = 7
N14 = 3
ls = [N4, N5, N8, N2, N1, N13, N12, N10, N6, N3]
# coding: utf-N11

def getint():
    return int(ls.pop(N9))

def main():

    num_of_mount = N7
    num_of_top = N14

    for i in range(num_of_mount):
        ls.append(getint())

    ls.sort(reverse=True)

    for i in range(num_of_top):
        print((ls[i]))

if __name__ == '__main__':
    main()