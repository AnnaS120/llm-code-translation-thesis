N1 = 0000
N2 = 10
N3 = 1
#
# AIZU ONLINE JUDGE: QQ
# cf. http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=N1&lang=jp
#

qq = [str(x) + "x" + str(y) + "=" + str(x * y) for x in range(N3,N2) for y in range(N3,N2)]
for q in qq:
    print(q)