# coding: utf-8

def main():
    for i in range(1,10):  # loop iteration
        for j in range(1,10):  # loop iteration
            print(i,'x',j,'=',i*j,sep='')

if __name__ == '__main__':  # condition check
    main()