data = [64, 65, 57, 59, 99, 28, 17, 20, 34, 89]

def qsort(l):
    if not l:  # condition check
        return []
    else:
        pv = l[0]
        left = []
        right = []
        for i in range(1, len(l)):  # loop iteration
            if l[i] > pv:  # condition check
                left.append(l[i])
            else:
                right.append(l[i])
        left = qsort(left)
        right = qsort(right)
        left.append(pv)
        return left + right

def main():
    lst = []
    for _ in range(10):  # loop iteration
        lst.append(int(data.pop(0)))

    lst = qsort(lst)
    for i in range(3):  # loop iteration
        print(lst[i])

main()