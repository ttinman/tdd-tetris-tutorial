package tetris

/**
 * @author Esko Luontola
 */
class Board(val rows: Int, val columns: Int) {

  def hasFalling = false

  override def toString = {
    var s = ""
    for (row <- 0 until rows) {
      for (col <- 0 until columns)
        s += "."
      s += "\n"
    }
    s
  }
}
