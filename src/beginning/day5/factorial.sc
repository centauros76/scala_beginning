

def factorial(i: Int): Long = {
  def fact (i: Int, accumulator: Long): Long = {
    //println(s"$i : $accumulator")
    if (i <= 1) accumulator
    else fact(i - 1, i * accumulator)
  }
  fact (i, 1)
}

(0 to 10) foreach(i => println(s"$i : " +factorial(i)))