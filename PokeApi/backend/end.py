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
    limit = queryparams.get('limit',default=5, type=int)

    results: str = data['results'][0:limit]

    # luego extraigas cada uno de los datos de los pokemones
    pokens = []

    for i in results:

        details = i['url']
        data = requests.get(details)
        pokemonData = data.json()

        img:str = pokemonData['sprites']
        names:str = pokemonData['name']
        movent1:str = pokemonData['moves']
        gameversion:str = pokemonData['game_indices']



        moventl = []
        versionl = []
        # imagenl = []
        contador = 0

        # for i in img:

        #     imgurl = i['front_default']
        #     imagenl.append(imgurl)
            
        #     contador += 1
        #     # print(contador)

        #     if contador == 1:
        #         contador = 0
        #         break                

        for i in movent1:

            movent = i['move']
            moventl.append(movent)
            
            contador += 1
            # print(contador)

            if contador == 3:
                contador = 0
                break
        
        for i in gameversion:

            version = i['version']
            versionl.append(version)
        
            contador += 1

            print(contador)
            if contador == 3:
                break
            
        poken = {
            'name': names,
            # 'imagen': imagenl,
            'versions': versionl,
            'movements': moventl
        }

        pokens.append(poken)
                

    return jsonify(pokens),200

if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True, port=port)  
