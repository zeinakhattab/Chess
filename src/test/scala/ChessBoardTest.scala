import org.scalatest.funsuite.AnyFunSuite
import scala.io.Source.*
import Colour.*

class ChessBoardTest extends AnyFunSuite {
  test("Part1: pieceOnSquare works correctly") {
    val rook = Rook(White, Square('b', 3))
    val cb = ChessBoard()
    assert(cb.noOfPieces == 0)
    cb.addPiece(rook)
    assert(cb.noOfPieces == 1)
    var returnedPiece = cb.pieceOnSquare(Square('b', 3))
    assert(returnedPiece == rook)
    returnedPiece = cb.pieceOnSquare(Square('c', 2))
    assert(returnedPiece == NullPiece)
  }

  test("Part1: ChessBoard:toString works correctly for Rook on h8") {
    val rook = Rook(White, Square('h', 8))
    val cb = ChessBoard()
    cb.addPiece(rook)
    val actual = cb.toString
    val actualArray = fromString(actual).getLines.toArray
    assert(actualArray(0) == "8  *  *  *  *  *  *  *  R")
    assert(actualArray(1) == "7  *  *  *  *  *  *  *  *")
    assert(actualArray(2) == "6  *  *  *  *  *  *  *  *")
    assert(actualArray(3) == "5  *  *  *  *  *  *  *  *")
    assert(actualArray(4) == "4  *  *  *  *  *  *  *  *")
    assert(actualArray(5) == "3  *  *  *  *  *  *  *  *")
    assert(actualArray(6) == "2  *  *  *  *  *  *  *  *")
    assert(actualArray(7) == "1  *  *  *  *  *  *  *  *")
    assert(actualArray(8) == "   a  b  c  d  e  f  g  h")
  }
}

