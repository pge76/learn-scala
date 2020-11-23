package mixins

trait RichIterator extends AIterator {
  def foreach(f: T => Unit): Unit = while (hasNext) f(next())
}
