def game(temp):
    digits=[]
    digits.append(temp%10)
    digits.append(temp//10)

    print(max(digits[0],digits[1])-min(digits[0],digits[1]))

game(18)