inputNum = []

for i in range(0, 10):
  inputNum.append(int(input()))

inputNum.sort(reverse=True)

for i in range(0, 3):
  print(inputNum[i])