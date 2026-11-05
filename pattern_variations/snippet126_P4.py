def main():
    for a in range(1,10):  # loop iteration
        for b in range(1,10):  # loop iteration
            print(("{}x{}={}".format(a,b,a*b)))
    return None

if __name__ == '__main__':  # condition check
    main()