case class With[A, B](a: A, b: B)

val with1: With[String, Int] = With("Foo", 1)
val with2: Double With Int = With(2.3, 2)

Seq(with1, with2) foreach { w =>
  w match {
    //case _ With _=> println(s"$w")
    case With(s: String, i) => println(s"$s with1 $i")
    case With(d: Double, i) => println(s"$d with2 $i")
    case _        => println(s"Unknow: $w")
  }
}
