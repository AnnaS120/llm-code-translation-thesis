N1 = 64
N2 = 55
N3 = 31
N4 = 34
N5 = 51
N6 = 36
N7 = 10
N8 = 12
N9 = 66
N10 = 82
N11 = 0
N12 = 4
N13 = 3
ans = [N4, N8, N5, N1, N10, N2, N3, N6, N9, N12]

for i in range (N11,N7):
    ans.append(int(ans.pop(N11)))
ans.sort(reverse=True)
for i in range (N11,N13):
    print((ans[i]))