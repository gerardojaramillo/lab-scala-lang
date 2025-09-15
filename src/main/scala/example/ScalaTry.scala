/**
 * ScalaTry.scala
 * @author
 *   Gerardo Jaramillo (https://gerardojaramillo.dev)
 */

package example

import scala.util.Try

object ScalaTry {

  def main(args: Array[String]): Unit = {

    val parseNumberFive = Try("5".toInt)

    parseNumberFive foreach (five => println(s"Number five: ${five}"))

  }

}
