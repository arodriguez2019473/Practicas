from flask import Flask, jsonify, request
from flask_cors import CORS
from database import db
from flask_migrate import Migrate


app = Flask(__name__)
app.config["SQLALCHEMY_DATABASE_URI"] = "postgresql+psycopg2://postgres:d3v-database@10.20.20.6:5432/auki"
CORS(app)
db.init_app(app)
migrte = Migrate(app, db)

port = 5000

if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True, port=port)