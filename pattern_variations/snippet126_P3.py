N1 = 10
N2 = 1
def main():
    for a in range(N2,N1):
        for b in range(N2,N1):
            print(("{}x{}={}".format(a,b,a*b)))
    return None

if __name__ == '__main__':
    main()