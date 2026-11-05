#coding:utf-8

if __name__ == '__main__':  # condition check

    for i in range(1,10):  # loop iteration
        for j in range(1,10):  # loop iteration
            message = str(i)
            message += "x"
            message += str(j)
            message += "="
            message += str(i*j)
            print(message)