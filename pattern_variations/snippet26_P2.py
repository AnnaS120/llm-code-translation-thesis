data = [55, 76, 79, 77, 18, 13, 25, 79, 10, 84]
print("\n".join(map(str, sorted([int(data.pop(0)) for _ in range(10)])[:-4:-1])))