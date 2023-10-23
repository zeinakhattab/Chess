class ChessBoard():
  va l dimension = 8
  private var pieces: Map[Square, Piece] = Map.empty

  def addPiece(piece: Piece): Unit =
    pieces += piece.square -> piece

  def noOfPieces: Int =
    pieces.size

  def pieceOnSquare(square: Square): Piece =
    pieces.getOrElse(square, NullPiece)

  override def toString: String =
    val board = new StringBuilder
    for (col <- 8 to 1 by -1)
      board.append(col).append("  ")
      for (row <- 1 to 8)
        val square = Square(('a' + row - 1).toChar, col)
        val piece = pieceOnSquare(square)
        board.append(piece.toString)
        if row < 8 then board.append("  ")
        else board.append("\n")
      board.append("")
    board.append("   a  b  c  d  e  f  g  h\n")
    board.toString()
