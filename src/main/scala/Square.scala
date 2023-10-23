class Square (var row: Char, var column: Int):
  private def canEqual(a: Any) = a.isInstanceOf[Square]

  override
  def equals(that: Any): Boolean =
    that match
      case that: Square => that.canEqual(this) &&
        this.row == that.row &&
        this.column == that.column
      case _ => false

  override
  def toString: String =
    row + "" + column