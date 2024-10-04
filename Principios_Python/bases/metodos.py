
def metodo():
    pass

# este es un metodo que no recibe nada que solo esta de paso 

def saludar():
    print('hola')

#  este metodo solo tiene un "hola" como instruccion

def imprimir(cadena: str):
    print(cadena)
# este metodo recibe un dato de tipo string o str

def imprimirConcatenado(cadenaA: str, cadenaB: str):
    concatenado: str = cadenaA + ' - ' + cadenaB
    print(concatenado)

    

imprimirConcatenado('primerAtributo', 'segundoAtributo')