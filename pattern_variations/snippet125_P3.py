N1 = 10
N2 = 1
print("".join(str([["%dx%d=%d"%(x,y,x*y) for y in range(N2,N1)] for x in range(N2,N1)]).replace("'","").replace("[","").replace("]","").replace(",","\n").replace(" ","")))