

object StringUtilV1 {
  //  def joiner(strings: String*): String = strings.mkString("-")
  //  def joiner(strings: List[String]): String = joiner(strings: _*)

  def joiner(strings: _*): String = strings.mkString("-")
}

println(StringUtilV1.joiner(List("Programming", "Scala")))
//println(StringUtilV1.joiner("Programming", "Scala", "Java"))