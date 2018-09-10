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

    var input = new File("/Users/Rene/Private/source/study/scala_beginning/src/beginning/day15/companyList.html")
    var doc: Document = Jsoup.parse(input, "UTF-8")
    var companyLists: Elements = doc.getElementsByTag("li");
    var count: Int = 0;
    for (companyList: Element <- companyLists.asScala) {
      count += 1;
      val companyName = companyList.getElementsByTag("span").text();
      println("companyName["+ count +"] :: " +companyName);
    }

    var companyCount = companyLists.size();
    println("companyCount :: " + companyCount);



    /*val agitLists: Elements = doc.getElementsByClass("category__item")
    for (agitList: Element <- agitLists.asScala) {
      val agitTitle = agitList.getElementsByClass("text-name").text()
      val agitLink = agitList.getElementsByTag("a").attr("href")
      val isHidden = !agitList.getElementsByClass("ico ico-lock").isEmpty
      println(s"$agitTitle : $agitLink : $isHidden")
    }*/
  }
}
