val anycase = Seq(1, 2, 2.8, "one", "two", "three", 3737373837L, 'four)



for (x <- anycase) {
  val str = x match {
    case 1 => "int 1"
    case i: Int => "other int: " + i
    case d: Double => "a double: " + d
    case "one" => "String one"
    case s: String => "other String: " + s
    case unexpected => "unexpected value : " + unexpected
  }
  println(str)
}


for (x <- anycase) {
  var str = x match {
    case 1 => "int i"
    case _: Int => "other int: " + x
    case _: Double => "a double: " + x
    case "one" => "a String: " + x
    case _: String => "other String: " + x
    case unexpected => "unexpected value: " + x
  }
  println(str)
}

for (x <- anycase) {
  var str = x match {
    case _: Double | _: Int => "a number: " + x
    case "one" => "String one"
    case _: String => "ohter String: " + x
    case _ => "unexpected value: " + x
  }
  println(str)
}