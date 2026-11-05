data = [64, 65, 57, 59, 99, 28, 17, 20, 34, 89]

def qsort(l):
    if not l:
        return []
    else:
        pv = l[0]
        left = []
        right = []
        for idx in range(1, len(l)):
            if l[idx] > pv:
                left.append(l[idx])
            else:
                right.append(l[idx])
        left = qsort(left)
        right = qsort(right)
        left.append(pv)
        return left + right

def main():
    lst = []
    for _ in range(10):
        lst.append(int(data.pop(0)))

    lst = qsort(lst)
    for idx in range(3):
        print(lst[idx])

main()