val configFile = new java.io.File("somefile.txt")

val configFilePath = if (configFile.exists()) {
  println("configFile exists")
  configFile.getAbsolutePath
} else {
  println("create configFile")
  configFile.createNewFile()
  configFile.getAbsolutePath()
}

  