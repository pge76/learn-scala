package higherorderfunc {

  object Main {
    def main(args: Array[String]): Unit = {
      val salaries = Seq(199999, 2828828, 323232)
      salaries.map((_ * 2)).foreach(println)
    }
  }

}
