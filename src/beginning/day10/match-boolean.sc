val bools = Seq(true, false, true, false)

for (bool <- bools) {
  bool match {
    case true => println("Got heads")
    case false => println("Got tails")
  }
}


for (bool <- bools) {
  val which = if (bool) "heads" else "tails"
  println(s"Got " + which)
}



List<ProductInfo> infoList = productRepository.selectAll(ProductConverter.convertToEntity(productInfo), pagination).stream()
  .map(d -> ProductConverter.convertToInfo(d)).collect(Collectors.toList());