/**
 * ScalaHigherOrderFunctions.scala
 * @author
 *   Gerado Jaramillo (https://gerardojaramillo.dev)
 */

package lab

object ScalaHigherOrderFunctions {

  def main(args: Array[String]): Unit = {

    // f: Int => Int is the function as parameter
    def applyFunct(n: Int, f: Int => Int): Int = f(n)

    println(s"basicPlusOne: ${applyFunct(3, x => x + 1)}")
    println(s"basicSubtOne: ${applyFunct(7, x => x - 1)}")

    // this function returns a function of Int => Int type.
    def makeAddr(x: Int): Int => Int = { (y: Int) =>
      x + y
    }

    val adder = makeAddr(5)
    println(s"result: ${adder(3)}")

    def curryingMultiplyFunct(a: Int)(b: Int): Int = { a * b }

    val twoTimes = curryingMultiplyFunct(2) _
    println(s"result: ${twoTimes(4)}")
  }

}
