
val stateCaptials = Map(
    "Alabama" -> "montgomery",
    "Alaska"  -> "Juneau",
    "Wyoming" -> "Cheyenne")

println("Get the capitals wrapped in Options:")
println("Alabama: " + stateCaptials.get("Alabama"))
println("Wyoming: " + stateCaptials.get("Wyoming"))
println("Unknown: " + stateCaptials.get("Unknown"))

println("Get the capitals themselves out of the Options:")
println("Alabama: " + stateCaptials.get("Alabama").get)
println("Wyoming: " + stateCaptials.get("Wyoming").getOrElse("Opps1"))
println("Unknown: " + stateCaptials.get("Unknown").getOrElse("Opps2"))
