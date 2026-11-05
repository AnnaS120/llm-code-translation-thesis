# -*- coding:utf-8 -*-

def main():
    i=0
    j=0

    for i in range(1,10):  # loop iteration
        for j in range(1,10):  # loop iteration
            print((str(i)+"x"+str(j)+"="+str(i*j)))

if __name__ == '__main__':  # condition check
    main()