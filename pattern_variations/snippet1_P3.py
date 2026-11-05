N1 = 100
N2 = 80
N3 = 96
N4 = 93
N5 = 58
N6 = 10
N7 = 45
N8 = 98
N9 = 57
N10 = 54
N11 = 0
N12 = 3
arr = [N12, N10, N9, N7, N4, N8, N2, N1, N5, N3]

for i in range(N6):
    arr.append(int(arr.pop(N11)))

arr.sort(reverse=True)

for i in range(N12):
    print(arr[i])
