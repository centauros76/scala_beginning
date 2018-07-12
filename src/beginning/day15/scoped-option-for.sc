val dogBreeds = Seq(Some("Doberman"), None, Some("Yorkshire Terrier"),
                    Some("Dachshund"), None, Some("Scottish Terrier"),
                    None, Some("Great Dane"), Some("Portuguese Water Dog"))

println("second pass: ")
for {
  Some(breed) <- dogBreeds
  upcaseBreed = breed.toUpperCase()
} println(upcaseBreed)