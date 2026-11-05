data = [19, 57, 74, 99, 35, 18, 1, 53, 34, 97]
mountains = [int(data.pop(0)) for idx in range(10)]
for idx in sorted(mountains)[7:10][::-1]:
    print(idx)