a,b,c=map(int,input().split(" "))
counterARR=0;counterMA=0

while(a>0):
    counterARR += 1
    a -= b+1

    if a<1:
        break

    counterMA += 1
    a -= c+1

print(str(counterARR)+" "+str(counterMA))
