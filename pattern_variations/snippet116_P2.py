#coding:utf-8

if __name__ == '__main__':

    for idx in range(1,10):
        for k in range(1,10):
            message = str(idx)
            message += "x"
            message += str(k)
            message += "="
            message += str(idx*k)
            print(message)