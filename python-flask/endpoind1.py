from flask import Flask, jsonify
import requests
import uuid

app = Flask(__name__)
port = 5000

response = requests.get("https://api.chucknorris.io/jokes/random")


data = response.json()


@app.route('/data', methods=['GET'])
def test():

    return data,200

if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True, port=port)