trait Third[A] {
  def hasNext: Boolean
  def next(): A
}

class ThirdIterator(to: Int) extends Third[Int] {
  private var current = 0
  override def hasNext: Boolean = current < to
  override def next(): Int = {
    if(hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }
}

