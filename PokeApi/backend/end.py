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
        pokemonData:dict = data.json()

        img:str = pokemonData.get('sprites', '')
        names:str = pokemonData['name']
        movent1:str = pokemonData['moves']
        gameversion:str = pokemonData['game_indices']
        fontimg:str = img['front_default']
        stats:str = pokemonData['stats']
        specie:str = pokemonData['species']
        audio:str = pokemonData['cries']
        audio1:str = audio['latest']
        tamano:str = pokemonData['height']

        peso:str = pokemonData['weight']
        habilidad:str = pokemonData['abilities']

        tipoe:str = pokemonData['types']
        
        urlspecie: str = specie['url']

        dataurlspecie = requests.get(urlspecie)
        dataespecie = dataurlspecie.json()


        feliz:str = dataespecie['base_happiness']
        capture:str = dataespecie['capture_rate']

        legendary:bool = dataespecie['is_legendary']
        mitico: bool = dataespecie['is_mythical']

        id: int = dataespecie['id']

        tipodepok: str = dataespecie['egg_groups']


        form:str = pokemonData['forms']
        for i in form:
            urlform:str = i['url']

            dataform = requests.get(urlform)
            formdata = dataform.json()

            esmega = formdata['is_mega']
        

        esmegae = []
        audiol = []
        moventl = []
        base = []
        versionl = []
        statsl = []
        tipopokemon = []
        habilidadl = []
        tipol = []
        contador = 0        
        
        audiol.append(audio1)
        esmegae.append(esmega)

        for i in tipoe:
            tip = i['type']
            name = tip['name']
            # tipol.append(name)

            urlimg = tip['url']
            imagendata = requests.get(urlimg)
            dataimg = imagendata.json()

            sprintcon:str = dataimg['sprites']
            urlelement:str = sprintcon['generation-iii']
            urlelement2 = urlelement['colosseum']
            imagenelemento = urlelement2['name_icon']
            tipol.append(imagenelemento)

            # for i in sprintcon:
            #     urlelement = i['generation-iii']
            #     urlelement2 = urlelement['colosseum']
            #     imagenelemento = urlelement2['name_icon']

            #     print(imagenelemento)


        for i in habilidad:
            habilidadtip = i['ability']
            ability = habilidadtip['name']
            habilidadl.append(ability)

            
            if contador == 25:
                contador = 0
                break

        for i in tipodepok:
            
            tipopok = i['name']
            tipopokemon.append(tipopok)

            
            if contador == 25:
                contador = 0
                break

        for i in stats:

            stat = i['stat']
            bases = i['base_stat']

            stasts = stat['name']

            base.append(bases)
            statsl.append(stasts)            
            contador += 1

            if contador == 25:
                contador = 0
                break

        for i in movent1:

            movent = i['move']
            namemovent = movent['name']
            moventl.append(namemovent)

            
            contador += 1

            if contador == 21:
                contador = 0
                break
        
        for i in gameversion:
            version = i['version']
            nameversion = version['name']

            versionl.append(nameversion)
        

            if contador == 20:
                contador = 0
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
            'habilidad':habilidadl,
            'tipoe':tipol,
            'audio':audiol,
            'mega':esmegae,
            'tamano':tamano,
        }

        pokens.append(poken)
                

    return jsonify(pokens),200

if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True, port=port)  
