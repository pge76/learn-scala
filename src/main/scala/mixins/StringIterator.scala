package mixins

class StringIterator(s: String) extends AIterator {
  override type T = Char
  private var i = 0

  override def hasNext: Boolean = i < s.length

  override def next(): Char = {
    val ch = s charAt i
    i += 1
    ch
  }
}
