def obtenerNumero() -> int:
    resultado: int = 10
    return resultado


def numeroAlCuadrado(numero: int) -> int:
    resultado: int = numero * numero
    return resultado

def multiplicarNumeros(numA: int, numB: int, numC: int):
    otro = numeroAlCuadrado(numC)
    return numA * numB * otro



parametro1: int = obtenerNumero()
parametro2: int = numeroAlCuadrado(6)
variable = multiplicarNumeros(parametro1, parametro2, 2)
print(variable)