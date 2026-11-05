inputNum = [38, 38, 14, 44, 34, 81, 40, 65, 15, 33]

for idx in range(0, 10):
  inputNum.append(int(inputNum.pop(0)))

inputNum.sort(reverse=True)

for idx in range(0, 3):
  print(inputNum[idx])