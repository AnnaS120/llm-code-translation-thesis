a = 'range(1, 10)'
exec(
    "for i in " + a + ":\n"
    "    for d in " + a + ":\n"
    "        print(str(i) + 'x' + str(d) + '=' + str(i * d))"
)