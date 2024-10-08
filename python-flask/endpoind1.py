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

    for i in range(1):
        response = requests.get("https://api.chucknorris.io/jokes/random")
    
        if response.status_code == 200:     
                data = response.json()
                # a.append(data) // si se agrega esto puedo duplicar 2 veces el endpoint 
                jokeId = data['id']

                if jokeId not in a:
                    a.append(data)  
                
                b.add(jokeId)

    return jsonify(a),200

if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True, port=port)


