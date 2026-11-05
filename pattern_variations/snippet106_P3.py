N1 = 10
N2 = 1
a = 'range(N2, N1)'
exec(
    "for i in " + a + ":\n"
    "    for d in " + a + ":\n"
    "        print(str(i) + 'x' + str(d) + '=' + str(i * d))"
)