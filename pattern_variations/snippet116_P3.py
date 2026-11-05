N1 = 10
N2 = 1
N3 = 8
#coding:utf-N3

if __name__ == '__main__':

    for i in range(N2,N1):
        for j in range(N2,N1):
            message = str(i)
            message += "x"
            message += str(j)
            message += "="
            message += str(i*j)
            print(message)