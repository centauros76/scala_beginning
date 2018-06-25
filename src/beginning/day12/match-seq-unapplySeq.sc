val nonEmptyList = List(1, 2, 3, 4, 5)
val emptyList = Nil
val nonEmptyMap = Map("one" -> 1, "two" -> 2, "three" -> 3)

def windows[T](seq: Seq[T]): String = seq match {
  case Seq(head1, head2, _*) => s"($head1, $head2), " + windows(seq.tail)
  case Seq(head, _*) => s"($head, _), " + windows(seq.tail)
  case Nil => "Nil"
}


for(seq <- Seq(nonEmptyList, emptyList, nonEmptyMap.toSeq)) {
  println(windows(seq))
}


def windows2[T](seq: Seq[T]): String = seq match {
  case head1 +: head2 +: tail => s"($head1, $head2), " + windows(seq.tail)
  case head +: tail => s"($head, _), " + windows(seq.tail)
  case Nil => "Nil"
}
for(seq <- Seq(nonEmptyList, emptyList, nonEmptyMap.toSeq)) {
  println(windows2(seq))
}


val seq = Seq(1, 2, 3, 4, 5)
val slide2 = seq.sliding(2)
slide2.toSeq
slide2.toList
seq.sliding(3, 2).toList
