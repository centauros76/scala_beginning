package beginning.day15

import java.io.File

import org.jsoup.Jsoup
import org.jsoup.nodes.{Document, Element}
import org.jsoup.select.Elements

import scala.collection.JavaConverters._

/**
  * Created by Rene on 2018. 7. 11..
  */

object AgitList {

  def main(args: Array[String]): Unit = {

    val input = new File("/Users/Rene/Private/source/study/testProject/src/main/java/com/tistory/centauros/agitList.html")
    val doc: Document = Jsoup.parse(input, "UTF-8")
    val agitLists: Elements = doc.getElementsByClass("category__item")
    for (agitList: Element <- agitLists.asScala) {
      val agitTitle = agitList.getElementsByClass("text-name").text()
      val agitLink = agitList.getElementsByTag("a").attr("href")
      val isHidden = !agitList.getElementsByClass("ico ico-lock").isEmpty
      println(s"$agitTitle : $agitLink : $isHidden")
    }
  }
}
