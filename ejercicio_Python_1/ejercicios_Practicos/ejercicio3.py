 
 # --- bucle de diccionario 

print('============================') 
print('====Recorrer diccionario====')
print('============================')

valores = {'A':1,'B':2,'C':3,'D':4,'E':5}

for k in valores:
    print(k)

# --- se le da el valor a cada uno dentro de un list dandole su respectivo valor y demas.

print('============================') 
print('==== Iterar diccionario ====')
print('============================')

valores = {'A':1,'B':2,'C':3,'D':4,'E':5}

for v in valores.values():
    print (v)

# --- imprime los numeros de la lista 

print('============================') 
print('====Iterar y Recorre dic====')
print('============================')

valores = {'A':1,'B':2,'C':3,'D':4,'E':5}
for k, v in valores.items():
    print('k= ',k, ', v=',v)

print('============================') 
print('=========For range==========')
print('============================')

for i in range(11):
    print(i)


print('============================') 
print('====Range star,max,cant=====')
print('============================')

for num in range(0,14,2):
    print(num)


# print('============================') 
# print('========= For_in ===========')
# print('============================')

def longitud(mi_lista):
    cont = 0
    for _ in mi_lista:
        cont += 1
    return cont

print('============================') 
print('========= Break ============')
print('============================')

coleccion = [2,4,5,7,8,9,3,4]
for e in coleccion:
    if e == 7:
        break
    print(e)



