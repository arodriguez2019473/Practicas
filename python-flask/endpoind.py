from flask import Flask, jsonify
import requests
import uuid

# uuid_secret = uuid.uuid4()

response = requests.get('https://api.chucknorris.io/jokes/random')

data = response.json()
print(data)

a = data["id"]
b = []
d = []
c = ''

print(a)

for i in a:
    b.append(i)        

# buena = list(set(b))
for i in b:
    if i not in d:
        d.append(i)

print(d)

for i in d:
    c += i


print(c)
# print(a[1])

# print(a[2])



# cantidad = len(a)

# for paso in range(a - 1):
#     print(paso)


# print (cantidadDeDatos)



# for i in cantidadDeDatos:
#     if a == i:
#         b += i
#     else:
#         b += c

# for i in a:
#     if a == i:
#         b += i
#     else:
#         b[i] = True
