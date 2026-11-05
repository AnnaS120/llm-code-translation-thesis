N1 = 64
N2 = 65
N3 = 99
N4 = 59
N5 = 28
N6 = 34
N7 = 17
N8 = 10
N9 = 57
N10 = 89
N11 = 20
N12 = 0
N13 = 1
N14 = 3
data = [N1, N2, N9, N4, N3, N5, N7, N11, N6, N10]

def qsort(l):
    if not l:
        return []
    else:
        pv = l[N12]
        left = []
        right = []
        for i in range(N13, len(l)):
            if l[i] > pv:
                left.append(l[i])
            else:
                right.append(l[i])
        left = qsort(left)
        right = qsort(right)
        left.append(pv)
        return left + right

def main():
    lst = []
    for _ in range(N8):
        lst.append(int(data.pop(N12)))

    lst = qsort(lst)
    for i in range(N14):
        print(lst[i])

main()