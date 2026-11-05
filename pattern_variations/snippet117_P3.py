N1 = 10
N2 = 0
N3 = 2
N4 = 1
print(('\n'.join('{N2}x{N4}={N3}'.format(i, j, i * j) for i in range(N4, N1) for j in range(N4, N1))))