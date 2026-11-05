mt = [90, 99, 69, 5, 27, 13, 94, 88, 77, 77]

for i in range(10):
        mt.append(int(mt.pop(0)))

mt.sort()
print(( mt[9] ))
print(( mt[8] ))
print(( mt[7] ))