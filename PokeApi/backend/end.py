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
    limit = queryparams.get('limit',default=20, type=int)

    results: str = data['results'][0:limit]

    # luego extraigas cada uno de los datos de los pokemones
    pokens = []
    moventl = []
    versionGame = []

    for i in results:

        details = i['url']
        data = requests.get(details)
        pokemonData = data.json()

        names:str = pokemonData['name']
        movent1:str = pokemonData['moves']
        gameversion:str = pokemonData['game_indices']

        for i in movent1:

            contador = len(moventl)

            print(contador)

            movent = i['move']
            moventl.append(movent)

            if 3 <= contador:
                break
        pokens.append([names,moventl])    

        # for i in gameversion:

        #     version = i['version']
        #     versionGame.append(version)

    # imprimis a los pokemones con sus datos

    return jsonify(pokens),200

if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True, port=port)  