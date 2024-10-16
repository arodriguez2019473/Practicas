import random

def generarListaRandom(longitud: int) -> list[int]:
    output: list[int] = []

    # llenar la lista

    lista = []

    print('ingrese un numero de datos')
    agregar = int(input(''))

    for paso in range(agregar + 1):
        lista.append(random.randint(0,100))

    print('Como quiere que se imprima')
    print('a) de menor a mayor')
    print('b) de mayor a menor')

    orden = input('Ingrese a o b: ')
        
    #saber cuantos elementos hay en la lista
    numElementos = len(lista)
            

    for paso in range (numElementos - 1):

        for index in range(numElementos - 1 - paso):
            intercambiarValores: bool = False
            if orden == 'a':
                intercambiarValores = lista[index] > lista[index+1]
            else:
                intercambiarValores = lista[index] < lista[index+1]
                
            if intercambiarValores == True:
                contenedor = lista[index]
                lista[index] = lista[index+1]
                lista[index+1] = contenedor

    print(lista)

    print('===========')
 

    # while i < agregar:
        
    #     i += 1

    #     if i == agregar:
            
    #         lista.append(random.randint(0,100))

    #         print(lista)
        

    

    return output

def bubleSort(lista: list[int]) -> list[int]:
    
    # ingresar los datos a lista 
    while True:

        numero = input("Ingresa un numero 'c' para terminar: ")
        
        if numero == 'c':
            break
        elif numero:
            if numero.isalpha():
                print('no es numero intenta poner nuevamente un valor numerico')
            
            elif numero == ' ':
                print('has agregado un espacio')
            
            else:
                print(numero)
                lista.append(int(numero))
        else:
            print('no has ingresado ningun caracter')

    print('Como quiere que se imprima')
    print('a) de menor a mayor')
    print('b) de mayor a menor')

    orden = input('Ingrese a o b: ')
        
    #saber cuantos elementos hay en la lista
    numElementos = len(lista)
            

    #volver a iniciar el ordenamiento: tantas veces como numeros hay en la lista
    for paso in range (numElementos - 1):

        #recorrer la lista
        for index in range(numElementos - 1 - paso):
            #si el valor actual es mayor que el valor siguiente: hacer un cambio entre los dos
            intercambiarValores: bool = False
            if orden == 'a':
                intercambiarValores = lista[index] > lista[index+1]
            else:
                intercambiarValores = lista[index] < lista[index+1]
                
            if intercambiarValores == True:
                contenedor = lista[index]
                lista[index] = lista[index+1]
                lista[index+1] = contenedor

    print(lista)

    print('===========')
 


    return lista
        
print('Generar lista')   
print('a)Si')
print('b)No')

respuesta = input('si o no: ')

if respuesta == 'si':
    generarListaRandom([])

elif respuesta == 'no':    
    lista = []
    bubleSort([])

else:
    respuesta('bye')
