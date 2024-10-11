from flask import Flask, jsonify, request
import requests

app = Flask(__name__)
port = 5000


URL = "https://pokeapi.co/api/v2/pokemon"
response = requests.get(URL)
data = response.json()

@app.route('/pokens', methods=['GET'])
def getpokes():

    queryparams = request.args
    limit = queryparams.get('limit',default=10, type=int)

    results = data['results'][:limit]
    
    return jsonify(results), 200



# @app.route('/', methods=['GET'])
# def home_resource():
    
#     queryparams = request.args
#     print(queryparams)
    
#     return jsonify(queryparams), 200

# @app.route('/pokenresult', methods=['GET'])

# def getresult():

#     result = []

#     result1: int = data['results']

#     result.append(result1)

#     return jsonify(result), 200


# @app.route('/xp', methods=['GET'])

# def getxp():

#     xp = []

#     xp1:int = data['base_experience']
#     xp.append(xp1)

#     return jsonify(xp), 200

# @app.route('/cria', methods=['GET'])
    
# def getcries():

#     crias = []

#     cria1:int = data['cries']
#     crias.append[cria1]

#     return jsonify(crias), 200

# @app.route('/forms', methods=['GET'])
# def getforms(): 

#     forms = []

#     form1:str = data['forms']
#     forms.append[form1]

#     return jsonify(forms), 200

# @app.route('/gameInd', methods=['GET'])
# def getgameInd():

#     gameind = []

#     gamein1:str = data['game_indices']
#     gameind.append[gamein1]

#     return jsonify(gameind), 200


if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True, port=port)  
