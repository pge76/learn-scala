package mixins

class RichStringIterator(s: String) extends StringIterator(s) with RichIterator

object Main {
  def main(args: Array[String]): Unit = {
    val richStringIterator = new RichStringIterator("Scala WTF?")
    richStringIterator.foreach(println)
  }
}

