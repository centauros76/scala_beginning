package beginning.day4

/**
  * Created by Rene on 2018. 5. 10..
  */
object ComplexNumbers {
  def main(args: Array[String]): Unit = {
    val c = new Complex(1.5, 2.3)
    println("imaginary part :: " + c.im)
    println("imaginary part :: " + c.toString())
  }
}
