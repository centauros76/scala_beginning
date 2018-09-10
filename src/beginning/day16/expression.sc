val x = 5 * 20 ; val amount = x + 10

val amount1 = {
  val x = 5*20
  x + 10
}

val t = { val a = 1; { val b = a * 2; {val c = b+4; c}}}

val x1 = 10; val y1 = 20

val max = x1 > y1 match {
  case true => x1
  case false => y1
}

val status = 500
val message = status match {
  case 200 =>
    "ok"
  case 400 => {
    println("error 400")
    "error"
  }
  case 500 => {
    println("error 500")
    "error"
  }
}


val day = "sunday"

val kind = day.toUpperCase() match {
  case "MON" | "TUE" | "WED" | "THU" | "FRI" =>
    "Weekday"
  case "SAT" | "SUN" =>
    "Weekend"
  case _ =>
    "what!!"
}


val message1 = "OK1"

val status1 = message1 match {
  case "OK" => 200
  case other => {
    println(s"Couldn't parse $other")
    -1
  }
}

val message2 = "Unauthorized"

val status2 = message2 match {
  case "OK" => 200
  case _ => {
    println(s"Couldn't parse $message2")
    -1
  }
}





val response: String = "null"

response match {
  case s if s != null => println(s"Reserved '$s'")
  case s => println("Error! Received a null response")
}

for (i <- 1 to 100 if i%3==0) {println(s"$i")}


val quote = "Faith, Hope,, Charity"
for {
  t <- quote.split(",")
  if t != null
  if t.size > 0
} {println(t)}

for {x <- 2 to 9 ;  y <- 1 to 9} {
  println(s"$x * $y = " + (x*y))
}


for (i <- 1 to 100) {
  print(s"$i ,")
  if (i%5 == 0) {print('\n')}
}

for (i <- 1 to 100) {
  if (i%3==0 && i%5==0) println(s"$i typesafe")
  if (i%3==0) println(s"$i type")
  if (i%5==0) println(s"$i safe")
}