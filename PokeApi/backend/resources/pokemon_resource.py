from flask_restx import Resource, fields, marshal_with
from database import db, Pokemon

from ..end import api

pokemonModel = {
    'id': fields.Integer,
    'nombre': fields.String,
    'altura': fields.Integer,
    'peso': fields.Integer
}

@api.route('/pokens', methods=['GET','POST'])
class PokemonsResource(Resource):

    @marshal_with(pokemonModel)
    def get(self):
        pokemons = db.session.query(Pokemon).all()
        return pokemons
    
    @marshal_with(pokemonModel)
    def post(self):
        data = api.payload
        newPokemon = Pokemon()
        newPokemon.nombre = data['nombre']
        newPokemon.altura = data['altura']
        newPokemon.peso = data['peso']
        
        db.session.add(newPokemon)
        db.session.commit()

        return newPokemon