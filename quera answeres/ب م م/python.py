def bmm(a,b):
    if(b==0):
        return a
    else:
        return bmm(b,a%b)

a=int(input())
b=int(input())
print(bmm(a,b))
