import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

def sleep(millis: Long) {
  Thread.sleep(millis)
}

def doWork(index: Int) : Int = {
  sleep((math.random * 10).toLong)
  return index
}

(1 to 5) foreach { index =>
  val future = Future {
    println("index : " + index)
    doWork(index)
  }

  future onComplete {
    c:Any => println(s"Complete!! returned: $c")
  }

  /*future onSuccess {
    case answer: Int => println(s"Success!! returned: $answer")
  }
  future onFailure {
    case th: Throwable =>  println(s"FAILURE!! returned: $th")
  }*/
}

sleep(100)
println("Finito!")
