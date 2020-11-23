package mixins

abstract class AIterator {
  type T
  def hasNext: Boolean
  def next(): T
}
