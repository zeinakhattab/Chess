
import org.scalatest.funsuite.AnyFunSuite

class SquareTest extends AnyFunSuite {
  test("Part1: equal squares") {
    val square1 = Square('h', 7)
    val square2 = Square('h', 7)
    assert(square1 == square2)
    assert(square2 == square1)
  }
}
