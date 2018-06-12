package beginning.day7

/**
  * Created by Rene on 2018. 6. 11..
  */
object ImportTest {


  def stuffWithBigInteger() = {
    import java.math.BigDecimal.{
      ONE => _,
      TEN,
      ZERO => JAVAZERO
    }

//    println("ONE: " + ONE);
    println("TEN: " + TEN);
    println("ZERO: " + JAVAZERO);
  }

  def main(args: Array[String]) {
    stuffWithBigInteger();
  }
}
