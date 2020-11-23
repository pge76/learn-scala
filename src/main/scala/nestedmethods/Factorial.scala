package nestedmethods

import nestedmethods.Factorial.factorial

import scala.annotation.tailrec

object Factorial {

  def factorial(x: Int): Int = {
    @tailrec
    def fact(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else fact(x - 1, x * accumulator)
    }
    fact(x,1)
  }

  def printFac(x: Int): Unit = println(s"Factorial of $x is " + factorial(x))

  def main(args: Array[String]): Unit = {
    LazyList.from(1).take(15).foreach(printFac)
  }
}
