# numero = int(input("Escriba un año: "))
# if numero % 4 == 0 and numero % 100 == 0:
#     print(f"El año {numero} no es un año bisiesto")
# else :
#     print(f"El año {numero} es un año bisiesto porque es múltiplo de 4 sin ser múltiplo de 100.")
# -------------------------

# numero1 = float(input('Ingrese el coeficiente a: '))
# numero2 = float(input('ingrese el coeficiente b: '))

# if numero1 == numero2 == 0:
#     print("Todos los números son solución")
# elif numero1 == 0:
#     print("La ecuación no tiene solución.")
# else:
#     print(f"la ecuacion tiene solucion {numero1/numero2}")
# ----------------------------------
# dividendo = bool(input('Escriba el dividendo: '))
# divisor = bool(input('Escriba el divisor: '))

# if divisor != 0:
#     print('No se puede dividir por cero.')

# elif divisor % dividendo:
#     print('la division es exacta')

# -----------------------------

# figura = ''


# while figura != 'c':\
    
#     print('============================')
#     print('Elija una figura geometrica: ')
#     print('============================')

#     print('a)Triangulo')
#     print('b)Circulo')
#     print('c)cancelar')

#     figura = input('Elige una letra (a,b o c): ')

#     if figura != 'c':
    
#         if figura == 'a':
            
#             base = float(input('Escriba la base: '))
#             altura = float(input('Escriba la altura: '))\
            
#             print(f'un triangulo tiene la base de {base} y una altura de {altura}, tiene un area de {base*altura/2}')
            
#             print('Desea Regresar al inicio')
#             print('1)si')
#             print('2)no')

#             cerrar = input('')

#             if cerrar != '2':
#                 print('')
#             elif cerrar != '1':
#                 break
#             else:
#                 print('no puso si >:(')

#         elif figura == 'b':
            
#             radio = float(input('Escriba el radio: '))

#             print (f'Un círculo de radio {radio}, tiene un area de {3.141592*radio**2}')

#         else:
#             print('tienes que elegir entre a o b')


# -----------------------

# centimetro = int(input('Ingrese los centimetros: '))

# if centimetro == 0:

#     print('Escriba una distancia mayor que cero')

# else:
#     print(f'{centimetro} centimetros son {centimetro/100000} km ,{centimetro/100} m y {centimetro} cm')


import random

# print(f'alberto: {(random.randrange(10))}')

alberto = random.randint(1,6)
barbara = random.randint(1,6)

print(f'alberto ha sacado {alberto}')
print(f'barbara ha sacado {barbara}')


if alberto > barbara :
    print(f'ha ganado barbara')
else :
    print(f'ha ganado alberto')


