import java.util

(2 to 9)foreach {
  i => (2 to 9) foreach {
     j => println(s"$i * $j = " + (i*j))
  }
}

val intToString: util.HashMap[Integer, String]