data = [68, 27, 2, 20, 100, 1, 64, 78, 48, 6]
print(*sorted([int(data.pop(0)) for _ in [0]*10])[:6:-1], sep="\n")