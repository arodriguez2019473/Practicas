ejemplo = []

ejemplo.append("coocdrilo")
ejemplo.append(1)
ejemplo.append(2)
ejemplo.append(3)
ejemplo.append(4)
ejemplo.append(5)
ejemplo.append("a remover")

print("sin remover ")
print(ejemplo)

ejemplo.pop(6)

print("se remueve el dato 6 con pop")
print(ejemplo)

print("se remueve el dato 0 con remove")
ejemplo.remove("coocdrilo")
print(ejemplo)