ls = [62, 77, 96, 99, 87, 7, 2, 1, 69, 75]
# coding: utf-8

def getint():
    return int(ls.pop(0))

def main():

    num_of_mount = 10
    num_of_top = 3

    for idx in range(num_of_mount):
        ls.append(getint())

    ls.sort(reverse=True)

    for idx in range(num_of_top):
        print((ls[idx]))

if __name__ == '__main__':
    main()