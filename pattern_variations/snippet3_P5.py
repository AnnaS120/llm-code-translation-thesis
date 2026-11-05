ans = [34, 12, 51, 64, 82, 55, 31, 36, 66, 4]

for i in range (0,10):
    ans.append(int(ans.pop(0)))
ans.sort(reverse=True)
for i in range (0,3):
    print((ans[i]))