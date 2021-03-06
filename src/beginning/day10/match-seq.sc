
val nonEmptySeq = Seq(1, 2, 3, 4, 5)
val nonEmptyMap = Map("one" -> 1, "two" -> 2, "three" -> 3)

def seqToString[T](seq: Seq[T]): String = seq match {
  case h +: t => s"($h +:  ${seqToString(t)})"
  case Nil => "(Nil)"
}

for (seq <- Seq(nonEmptySeq, nonEmptyMap.toSeq)) {
//  println("head : " + seq.head + " - tail : %s".format(seq.tail))

  println(seqToString(seq))
}


