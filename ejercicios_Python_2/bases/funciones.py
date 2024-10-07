# funciones son aquellas que retornan datos no como los metodos que hacen una instruccion este nos da el resultado

def obtenerNumero() -> int:
    resultado: int = 10
    return resultado

#  este retorna el dato resultado en dado caso este da el dato 10 

def numeroAlCuadrado(numero: int) -> int:
    resultado: int = numero * numero
    return resultado

# igualmente este tambien retorna resultado pero en dado caso recibe un parametro de numero int y este se multiplica a si mismo y
# recibe el resultado y este lo retorna

def multiplicarNumeros(numA: int, numB: int, numC: int):
    otro = numeroAlCuadrado(numC)
    return numA * numB * otro

# cuando hacemos la funcion recibe 3 datos como tal 

parametro1: int = obtenerNumero()
parametro2: int = numeroAlCuadrado(6)
variable = multiplicarNumeros(parametro1, parametro2, 2)
print(variable)