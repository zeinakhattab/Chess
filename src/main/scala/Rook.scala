import Colour.*
class Rook (colour: Colour, square: Square) extends Piece (colour, square):
  override
  def toString: String =
    val c = colour match
      case Black => "r"
      case White => "R"
      case _ => "Invalid colour"
    c

  def legalMoves(chessBoard: ChessBoard): Array[Square] =
    var array = Array[Square]()
    for (row <- 'a' to 'h')
      val validSquare = Square(row, square.column)
      if validSquare != square then
        array = array :+ validSquare
    for (col <- 1 to 8)
      val validSquare = Square(square.row, col)
      if validSquare != square then
        array = array :+ validSquare
    array