import Colour.*
object NullPiece extends Piece(Black, Square(' ', 0)):
  override def toString: String =
    "*" 