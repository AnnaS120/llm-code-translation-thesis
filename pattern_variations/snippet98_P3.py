N1 = 10
N2 = 1
def main():
    for i in range(N2, N1):
        for j in range(N2, N1):
            print(i,end = "")
            print("x",end = "")
            print(j,end = "")
            print("=",end = "")
            print(i*j)


if __name__ == "__main__":
    main()