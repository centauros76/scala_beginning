def countTo(n: Int): Unit = {
  def count(i: Int): Unit = {
    if(i <= n) {println(i); count(i+1)}
  }
  count(2)
}

countTo(5)
