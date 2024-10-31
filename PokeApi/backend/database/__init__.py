from flask_sqlalchemy import SQLAlchemy

db = SQLAlchemy()

from .pokemon import Pokemon
from .movimiento import Movimiento