from sqlalchemy import Integer, String
from sqlalchemy.orm import Mapped, mapped_column

from . import db

class Pokemon(db.Model):
    __tablename__ = "pokemon"

    id: Mapped[int] = mapped_column(Integer, primary_key=True)
    nombre: Mapped[str] = mapped_column(String(50))
    altura: Mapped[int] = mapped_column(Integer)
    peso: Mapped[int] = mapped_column(Integer)
    

