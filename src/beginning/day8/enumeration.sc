object Breed extends Enumeration {
  type Breed = Value
  val doberman = Value("Doberman Pinscher")
  val yorkie   = Value("YorkshireTerrier")
  val scottie  = Value("ScottishTerrier")
  val dane     = Value("GreatDane")
  val portie   = Value("Portuguese WaterDog")
}

import Breed._

println("ID\tBreed")
for (breed <- Breed.values) println(s"${breed.id}\t$breed")

println("\nJust Terriers :")
Breed.values filter (_.toString.endsWith("Terrier")) foreach println

def isTerrier(b: Breed.Breed) = b.toString.endsWith("Terrier")
Breed.values filter isTerrier foreach println
