def main():
    for i in range(1, 10):  # loop iteration
        for j in range(1, 10):  # loop iteration
            print(i,end = "")
            print("x",end = "")
            print(j,end = "")
            print("=",end = "")
            print(i*j)


if __name__ == "__main__":  # condition check
    main()