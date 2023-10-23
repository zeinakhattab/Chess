import Colour.*
@main def hello: Unit =
  val rook = Rook(White, Square('d',5))
  val cb = ChessBoard()
  cb.addPiece(rook)
  println(cb)