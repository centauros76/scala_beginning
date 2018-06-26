object Op extends Enumeration {
  type Op = Value

  val EQ = Value("=")
  val NE = Value("!=")
  val LTGT = Value("<>")
  val LT = Value("<")
  val GT = Value(">")
  val LE = Value("<=")
  val GE = Value(">=")
}

import Op._

case class WhereOp[T](columnName: String, op: Op, value: T)

case class WhereIn[T](columnName: String, val1: T, vals: T*)

val wheres = Seq(
  WhereIn("state", "IL", "CA", "VA"),
  WhereOp("state", EQ, "IL"),
  WhereOp("name", NE, "Buck Trends"),
  WhereOp("age", GT, "29")
)

for (where <- wheres) {
  where match {
    case WhereIn(col, val1, vals @ _*) =>
      val valStr = (val1 +: vals).mkString(", ")
      println(s"WHERE $col In ($valStr)")
    case WhereOp(col, op, value) => println(s"WHERE $col $op $value")
    case _ => println(s"ERROR: Unknown expression: $where")
  }
}