# answeres of each person
from os import popen


def keyvoon(digit, answer):
    if ((digit % 6 == 0 or digit % 6 == 1) and (answer==3)) or ((digit % 6 == 2 or digit % 6 == 3) and (answer==1)) or ((digit % 6 == 4 or digit % 6 == 5) and (answer==2)):
        return True

def nezam(digit, answer):
    if ((digit % 3 == 0) and (answer==1)) or ((digit % 3 == 1) and (answer==2)) or ((digit % 3 == 2) and (answer==3)):
        return True
        
def shir(digit, answer):
    if ((digit % 4 == 0 or digit % 4 == 2) and (answer==2)) or ((digit % 4 == 1) and (answer==1)) or ((digit % 4 == 3) and (answer==3)):
            return True


# variables
input()
answer=[]
answer=list(map(int,list(input())))
counter={
    "keyvoon":0,
    "nezam":0,
    "shir farhad":0
}

# comparing sheet with answeres
for digit in range(len(answer)):

    if keyvoon(digit, answer[digit]):
        counter["keyvoon"] += 1
    if nezam(digit, answer[digit]):
        counter["nezam"] += 1
    if shir(digit, answer[digit]):
        counter["shir farhad"] += 1
    
val=max(counter.values())

print(val)
for keys,values in counter.items():
    if val==values:
        print(keys)




