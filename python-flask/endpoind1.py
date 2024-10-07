from flask import Flask, jsonify
import requests
import uuid

app = Flask(__name__)
port = 5000

response = requests.get("https://api.chucknorris.io/jokes/random")
   

