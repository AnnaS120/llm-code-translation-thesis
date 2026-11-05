N1 = 9
N2 = 1
for i in range (N1):
    for j in range (N1):
        p=i+N2
        q=j+N2
        ans=p*q
        QQ=str(p)+"x"+str(q)+"="+str(ans)
        print(QQ)