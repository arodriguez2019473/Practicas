valorVerdadero: bool = True
valorFalso: bool = False

varAnd: bool = True and True # true && true

# print(True and True)   # True
# print(True and False)  # False
# print(False and True)  # False
# print(False and False) # False

varOr: bool = True or False # true || false

# print(True or True)   # True
# print(True or False)  # True
# print(False or True)  # True
# print(False or False) # False

negacion: bool = not True

# print(not True)  # False
# print(not False) # True
# print(not not not not True) # True
# print(not 0) # True
# print(not 1) # False

negacionCondicional: bool = not (True or False)

# print(True and True and False)
#      |-------------|
#            True  and  False
#          |------------------|
#                 False


igual: bool = True == True

# print(4==4)          # True
# print(4==5)          # False
# print(4==4.0)        # True
# print(0==False)      # True
# print("asd"=="asd")  # True
# print("asd"=="asdf") # False
# print(2=="2")        # False
# print([1, 2, 3] == [1, 2, 3]) # True

noIgual: bool = True != False

# print(4!=4)          # False
# print(4!=5)          # True
# print(4!=4.0)        # False
# print(0!=False)      # False
# print("asd"!="asd")  # False
# print("asd"!="asdf") # True
# print(2!="2")        # True
# print([1, 2, 3] != [1, 2, 3]) # False


mayor: bool = 5 > 1

# print(5>3) # True
# print(5>5) # False
# print(True==1) # True
# print(True>0.999)  # True
# print([1, 2] > [10, 10]) # False

mayorIgual: bool = 5 >= 5

# print(3>=3) # True
# print([3,4] >= [3,5]) # False

menor: bool = 1 < 5

# print("abc" < "abd") # True
# print("A"<"a") # True
# print(ord('A')) # 65
# print(ord('a')) # 97

menorIgual: bool = 3 <= 3

# print(3<=2.99999999999999999) # false

# ------------------------------------------

# todos los operadores logicos
# a=7; b=2
# print("Operadores de asignación")
# x=a; x+=b;  print("x+=", x)  # 9
# x=a; x-=b;  print("x-=", x)  # 5
# x=a; x*=b;  print("x*=", x)  # 14
# x=a; x/=b;  print("x/=", x)  # 3.5
# x=a; x%=b;  print("x%=", x)  # 1
# x=a; x//=b; print("x//=", x) # 3
# x=a; x**=b; print("x**=", x) # 49
# x=a; x&=b;  print("x&=", x)  # 2
# x=a; x|=b;  print("x|=", x)  # 7
# x=a; x^=b; print("x^=", x)   # 5
# x=a; x>>=b; print("x>>=", x) # 1
# x=a; x<<=b; print("x<<=", x) # 28

