import Colour.*
abstract class Piece (val colour: Colour, var square: Square):
  override
  def toString: String =
      "*"

  object Piece extends Enumeration {
    type Piece = Value
    val Pawn = Value('p')
    val Bishop = Value('b')
    val Knight = Value('n')
    val Rook = Value('r')
    val Queen = Value('q')
    val King = Value('k')
  }