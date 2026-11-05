a = 'range(1, 10)'
exec(
    "for idx in " + a + ":\n"
    "    for d in " + a + ":\n"
    "        print(str(idx) + 'x' + str(d) + '=' + str(idx * d))"
)