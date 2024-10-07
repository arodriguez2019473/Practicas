# para probar cada uno solo pones print(y lo que no esta comentado)
# 1 = true
# 0 = false

numero1: int = 25
c: int = 40

a = 0b1101
b = 0b1011


bin(numero1)
# 0b11011
# vuelve el dato numerico int en dato a binario el ob se lo agrega python cuando se hace la accion


bin(a & b)
#0b1001
# Este es el and barato pero funcional lo que hace este es comprobar elemento por elemento osea que verifica cada uno vamos primer dato 
# "1 and 1  = true = 1" vamos por el segundo dato de a y b"1 and 0 = false = 0" por que pasa esto por que nosotros estamos en binario
# los numeros binarios solo existen 0 y 1 entonces 1 = true y 0 false 

bin(a | b)
# 0b1111

# este es el or que hace lo mismo que & solo que igualmente lo hace elemento por elemento por que da 1111 por que comprueba y recordemos
# en operadores_logicos.py esta la tabla de or donde dice si "true or true = true" y que "true or false = true" y recordemos que 1 es
# true entonces es "1 or 1 = 1","1 or 0 = 1" 


bin(c)
bin(~c)
0b101000
-0b101001

# que hace esto pues invierte los datos de cada elemento es el not en elementos osea que hace "not 1 = 0 " por que lo vuelve a falso 
# puedes verificar en la tabla de logicos en not