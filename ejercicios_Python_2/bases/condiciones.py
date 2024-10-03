variable: bool = True
numero: int = 400

# if sencillo
# if (variable):
#     print('verdadero')

# if else
# if (variable):
#     print('verdadero')
# else:
#     print('falso')

# if elif else
if numero >= 0 and numero < 100:
    print('entre 0 y 100')
elif numero >= 100 and numero < 200:
    print('entre 100 y 200')
elif numero >= 200 and numero < 300:
    print('entre 200 y 300')
else:
    print('no cumple')

if not numero >= 0 and numero < 100:
    pass

