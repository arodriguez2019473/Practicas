a = 0
b = 1
c = 1

fivonacci = list()

fivonacci = [0,1]



while c <= 5:
    c=a+b
    fivonacci.append(c)
    a=b
    b=c


print(fivonacci)
print('termina proceso')

