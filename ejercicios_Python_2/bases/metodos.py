# ten en cuenta que que los metodos no envian datos y no retornan si no que solo hacec un proceso

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

# este metodo tiene 2 parametros de tipo string y solo hace una instruccion valida

imprimirConcatenado('primerAtributo', 'segundoAtributo')