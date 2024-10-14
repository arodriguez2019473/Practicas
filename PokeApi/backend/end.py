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
    # luego devolvas la lsita de los 10 pokemones
    
    queryparams = request.args
    limit = queryparams.get('limit',default=10, type=int)
    results = data['results'][0:limit:1]
# [1:limit:1]

    # luego extraigas cada uno de los datos de los pokemones

    detalles = results['url']

    # response1 = requests.get(details)

    # data1 = response1.json()

    # print(data1)

    return jsonify(results), 200

if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True, port=port)  


@app.route('/details', methods=['GET'])
def getdetails():

    response = requests.get(URL)
    data = response.json()
    results = data['url']

    return jsonify(results), 200