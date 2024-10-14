
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

    queryparams = request.args
    limit = queryparams.get('limit', default=10, type=int)

    results = data['results'][0:limit]

    pokemon_details = []
    for result in results:
        pokemon_url = result['url']
        response2 = requests.get(pokemon_url)
        pokemon_data = response2.json()
        pokemon_details.append(pokemon_data)

    return jsonify({'results': results, 'details': pokemon_details}), 200

if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True, port=port)