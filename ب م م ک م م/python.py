def bmm(a,b):
    if(b==0):
        return a
    else:
        return bmm(b,a%b)

temp=input()
a,b=temp.split(" ")

bmm=bmm(int(a),int(b))
kmm=(int (a)* int (b) )/bmm
print(bmm," ",int(kmm))
