N1 = 65
N2 = 40
N3 = 15
N4 = 14
N5 = 81
N6 = 34
N7 = 38
N8 = 10
N9 = 33
N10 = 44
N11 = 0
N12 = 3
inputNum = [N7, N7, N4, N10, N6, N5, N2, N1, N3, N9]

for i in range(N11, N8):
  inputNum.append(int(inputNum.pop(N11)))

inputNum.sort(reverse=True)

for i in range(N11, N12):
  print(inputNum[i])