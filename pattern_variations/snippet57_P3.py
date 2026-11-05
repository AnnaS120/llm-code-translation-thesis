N1 = 10
N2 = 1
# Vol0000.
import sys

def main():
    for i in range(N2, N1):
        for k in range(N2, N1):
            print((str(i) + "x" + str(k) + "=" + str(i * k)))

if __name__ == "__main__":
    main()

