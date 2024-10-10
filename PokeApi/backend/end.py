from flask import Flask, jsonify
import requests


app = Flask(__name__)
port = 5000

@app.route('/pokens', methods=['GET'])

def getpokes():

    pokens = []

    response = requests.get("https://pokeapi.co/api/v2/pokemon/ditto")

    data = response.json()

    pokens.append(data)

    return jsonify(pokens), 200

if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True, port=port)  
