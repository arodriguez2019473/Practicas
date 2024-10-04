def potencialterado(m: int, n: int):

    resultado:int = 1

    for i in range(n):
        resultado = resultado*m
        print(resultado)
    return resultado

def potenciadorRecursivo(m: int, n: int):

    if n==0:
        return
    else:

        return print(m *(m,n-1)) 

parametro1: int = potencialterado(3,6)
parametro2: int = potenciadorRecursivo(3,6)