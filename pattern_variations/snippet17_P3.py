N1 = 95
N2 = 15
N3 = 97
N4 = 39
N5 = 73
N6 = 78
N7 = 43
N8 = 10
N9 = 33
N10 = 26
N11 = 9
N12 = 0
N13 = 3
arr = [N1, N10, N3, N2, N5, N6, N9, N11, N4, N7]

for i in range(N8):
    t = int(arr.pop(N12))
    arr.append(t)

arr.sort(reverse=True)
for i in range(N13):
    print(arr[i])