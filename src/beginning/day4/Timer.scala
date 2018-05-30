package beginning.day4

/**
  * Created by Rene on 2018. 5. 10..
  */
object Timer {

  def oncePerSecond(callback: () => Unit): Unit = {
    while(true) {
      callback();
      Thread sleep 1000
    }
  }

//  def timeFile(): Unit = {
//    println("time flies like an arrow...")
//  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(() => println("time flies like an arrow..."))
  }
}
