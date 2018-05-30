package beginning.day4

/**
  * Created by Rene on 2018. 5. 10..
  */
class Complex (real: Double, imaginary: Double){
  def re = real
  def im = imaginary
  override def toString() = "" + re + (if (im < 0) "" else "+") + im + "i"
}
