from flask import Flask, jsonify, request
import requests
import uuid

app = Flask(__name__)
port = 5000

URL = "https://pokeapi.co/api/v2/pokemon"

@app.route('/pokens', methods=['GET'])
def getpokes():

    response = requests.get(URL)
    data = response.json()

    # Extraigas una lista de 10 pokemones
    
    queryparams = request.args
    
    limit = queryparams.get('limit',default=10, type=int)

    results: str = data['results'][0:limit]

    contador = len(results)

        # luego extraigas cada uno de los datos de los pokemones
    print(results[0])
    
    URL2 = []   
    i:int = 0

    while i < contador: 

        for result in results:


            print(i)

            details = result['url']
            response2 = requests.get(details)
            data2 = response2.json()
            URL2.append(data2)


            return jsonify(results[i], URL2),200

        # URL2.append(result['url'])
            
        # # luego devolvas la lsita de los 10 pokemones

        # print(URL2)

        # response2 = requests.get(URL2[0])
        # data2 = response2.json()

        # details: str = data2

        # # imprimir las listas con los datos de los pokemones        

if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True, port=port)  


