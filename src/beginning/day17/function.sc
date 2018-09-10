def multiplier (x: Int, y: Int): Int = {x * y}
multiplier(4,6)

def safeTrim(s: String): String = {
  if (s == null) return null
  s.trim()
}
val a = safeTrim(" test ")
println(s"[$a]")
