def main():
    for idx in range(1,10):
        for k in range(1,10):
            mul = idx * k
            print(("{0}x{1}={2}".format(idx,k,mul)))

if __name__ == '__main__':
    main()