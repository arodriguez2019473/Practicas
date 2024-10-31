from sqlalchemy import Integer, String
from sqlalchemy.orm import Mapped, mapped_column

from . import db

class Movimiento(db.Model):
    __tablename__ = "movimiento"

    id: Mapped[int] = mapped_column(Integer, primary_key=True)
    nombre: Mapped[str] = mapped_column(String(50))