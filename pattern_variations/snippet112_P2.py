# -*- coding:utf-8 -*-

def main():
    idx=0
    k=0

    for idx in range(1,10):
        for k in range(1,10):
            print((str(idx)+"x"+str(k)+"="+str(idx*k)))

if __name__ == '__main__':
    main()