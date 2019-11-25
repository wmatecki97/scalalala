import java.util.Dictionary

import scala.io.Source


object Occurencess extends App {
  val file = "http://www.textfiles.com/etext/AUTHORS/DOYLE/doyle-hound-383.txt"
  val html = Source.fromURL(file)
  var occurencess = html.mkString
    .replace("\""," ")
    .replace("."," ")
    .replace("'"," ")
    .replace("?"," ")
    .replace("\n"," ")
    .replace("\r"," ")
    .replace("\t"," ")
    .replace(","," ")
    .split(" ")
    .filter(x => x != " ")
    .groupBy(x => x).toList.sortBy(x => x._2)

  //println(occurencess)

  occurencess.foreach(x => println(x._1.toString() + " " + x._2.length.toString()))

  //val s = html.mkString.replaceAll("""[\p{Punct}]""", "").toLowerCase()
  //val tokens = s.split("\\W+").toList
  //val words = Map[String,Int]()
}
