import org.scalatest.funsuite.AnyFunSuite
import Colour.*

class RookTest extends AnyFunSuite {
  test("Part1: White Rook constructed correctly") {
    val rook = Rook(White, Square('h', 7))
    assert(rook.toString === "R")
    assert(rook.square === Square('h', 7))
  }

  test("Part2: legalMoves works for lone rook midboard") {
    val rook = Rook(Black, Square('d', 4))
    val cb = ChessBoard()
    cb.addPiece(rook)
    val moves = rook.legalMoves(cb)
    assert(moves.length === 14)
    for i <- 5 to cb.dimension do
      assert(moves.contains(Square('d', i)))
    for i <- 1 to 3 do
      assert(moves.contains(Square('d', i)))
    for c <- 'a' to 'c' do
      assert(moves.contains(Square(c, 4)))
    for c <- 'e' to 'h' do
      assert(moves.contains(Square(c, 4)))
  }

  test("Part3: Black Rook constructed correctly") {
    val rook = Rook(Black, Square('e', 4))
    assert(rook.toString === "r")
    assert(rook.square === Square('e', 4))
  }
}
