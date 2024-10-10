from flask import Flask, jsonify, render_template
import requests
import uuid

app = Flask(__name__)
port = 5000
@app.route('/')

@app.route('/data', methods=['GET'])

def test():
    a = []
    b = set()
    rango = 1
    while len(b) < rango: 
        response = requests.get("https://api.chucknorris.io/jokes/random")
        if response.status_code == 200:
                data = response.json()
                jokeId:str = data['id']
                if not jokeId in b:
                    b.add(jokeId)
                    a.append(data)
                    
    return jsonify(a),200

if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True, port=port)


