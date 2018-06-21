var seq = Seq(1, 2, 3, 4)

for (i <- seq) {
  i match {
    case _ if i%2 == 0 => println(s"even: $i")
    case _  => println(s"odd: $i")
  }
}


//4.6 match case class
case class Address(street: String, city: String, country: String)
case class Person(name: String, age: Int, address: Address)

val alice = Person("alice", 25, Address("1 scala Lane", "chicago", "USA"))
val rene  = Person("rene", 43, Address("102-1202 wolgero 53gil 21 ", "seoul", "KOREA"))
val bob   = Person("bob", 32, Address("2 Java Ave.", "Miami", "USA"))

for (person <- Seq(alice, rene, bob)) {
  person match {
    case Person("rene", _, _) => println("Hi, rene!!")
    case Person("alice", 25, Address(_, "chicago", _)) => println("hi, alice")
    case Person(name, age, Address(_, _, "USA")) => println(s"who are you??? name: $name, age: $age right??")
  }
}