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
    limit = queryparams.get('limit',default=3, type=int)

    results: str = data['results'][0:limit]

    # luego extraigas cada uno de los datos de los pokemones
    pokens = []

    for i in results:

        
        details = i['url']
        data = requests.get(details)
        pokemonData:dict = data.json()

        img:str = pokemonData.get('sprites', '')
        names:str = pokemonData['name']
        movent1:str = pokemonData['moves']
        gameversion:str = pokemonData['game_indices']
        fontimg:str = img['front_default']
        stats:str = pokemonData['stats']
        specie:str = pokemonData['species']

        peso:str = pokemonData['weight']
        habilidad:str = pokemonData['abilities']


        urlspecie: str = specie['url']

        dataurlspecie = requests.get(urlspecie)
        dataespecie = dataurlspecie.json()


        feliz:str = dataespecie['base_happiness']
        capture:str = dataespecie['capture_rate']

        legendary:bool = dataespecie['is_legendary']
        mitico: bool = dataespecie['is_mythical']

        id: int = dataespecie['id']

        tipodepok: str = dataespecie['egg_groups']


        moventl = []
        base = []
        versionl = []
        statsl = []
        tipopokemon = []
        habilidadl = []
        contador = 0        

        for i in habilidad:
            habilidadtip = i['ability']
            ability = habilidadtip['name']
            habilidadl.append(ability)

        for i in tipodepok:
            
            tipopok = i['name']
            tipopokemon.append(tipopok)

        for i in stats:

            stat = i['stat']
            bases = i['base_stat']

            stasts = stat['name']

            base.append(bases)
            statsl.append(stasts)            
            contador += 1

            if contador == 8:
                contador = 0
                break

        for i in movent1:

            movent = i['move']
            namemovent = movent['name']
            moventl.append(namemovent)
            
            contador += 1
            # print(contador)

            # if contador == 7:
            #     contador = 0
            #     break
        
        for i in gameversion:
            version = i['version']
            nameversion = version['name']

            versionl.append(nameversion)
        
            contador += 1

            if contador == 4:
                break
            
        poken = {
            'name': names,
            'imagen': fontimg,
            'versions': versionl,
            'movements': moventl,
            'stats': statsl,
            'base': base,
            'felicidad':feliz,
            'rango_captura':capture,
            'legendario':legendary,
            'mitico':mitico,
            'id':id,
            'tipo':tipopokemon,
            'peso':peso,
            'habilidad':habilidadl
        }

        pokens.append(poken)
                

    return jsonify(pokens),200


if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True, port=port)  
