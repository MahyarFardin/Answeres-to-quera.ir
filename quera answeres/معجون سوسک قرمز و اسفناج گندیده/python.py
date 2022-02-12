a,b,c,d,m=map(float,input().split(" "))

if (a+(m*c)>b+(m*d) and m*c>m*d) or (b+(m*d)>a+(m*c) and m*c<m*d):
    print("Eyval baba!")
else:
	print("Naaa, eshtebahe!")
