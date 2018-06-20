val noEmptyList = List(1, 2, 3, 4, 5)

def listToString[T](list: List[T]): String = list match {
  case h :: t => s"($h :: ${listToString(t)})"
  case Nil => ("Nil")
}

for (i <- List(noEmptyList)) {println(listToString(i))}


val s1 = (1 :: (2 :: (3 :: (4 :: (5 :: Nil)))))
val s2 = (("one",1) +: (("two",2) +: (("three",3) +: Nil)))
val m = Map(s2:_*)