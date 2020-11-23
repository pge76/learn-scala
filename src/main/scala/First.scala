class First(var x: Int = 0, var y: Int = 0) {

  def move(dx: Int, dy: Int): Unit = {
    x += dx
    y += dy
  }

  override def toString: String =
    s"($x, $y)"

}



