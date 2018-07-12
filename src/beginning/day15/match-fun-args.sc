case class Address(street: String, city: String, country: String)
case class Person(name: String, age: Int)

val as = Seq (
  Address("1 Scala Lane", "Anytown" , "MOMOLAND"),
  Address("2 Java Lane", "Othertown", "HAHALAND")
)

val ps = Seq (
  Person("Mike", 29),
  Person("Piter", 33)
)

val pas = ps zip as

//bad example
pas map {tup =>
  val Person(name, age) = tup._1
  val Address(street, city, country) = tup._2
  s"$name (age: $age) lives at $street, $city, in $country"
}

//good example
pas map {
  case (Person(name, age), Address(street, city, country)) =>
    s"$name (age: $age) lives at $street, $city, in $country"
}
