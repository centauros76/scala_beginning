case class Address(street: String, city: String, country: String)
case class Person(name: String, age: Int, address: Address)

val alice = Person ("Alice", 25, Address("1 scala Lane", "Chicago", "USA"))
val rene = Person("rene.kwak",43, Address("2 nowon", "seoul", "KOREA"))
val charlie = Person("Charlie", 32, Address("3 Python Ct.", "Boston", "USA"))

for (person <- Seq(alice, rene, charlie)) {
  person match {
    case p @ Person("Alice", _, _) => println(s"Hi Alice")
    case p @ Person(_, 43, _) => println(s"${p.name}'s age is ${p.age}")
    case p @ Person(_, _, Address(_, "Boston", _)) => println(s"${p.name} live in Boston")
  }
}