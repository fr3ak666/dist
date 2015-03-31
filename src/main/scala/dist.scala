/**
 * Created by fr3ak on 3/31/15.
 */
import scala.io._


object dist extends App {

  val in = Source.fromFile("/usr/share/dict/words")
  val out = "dupa.txt"
  val words = in.getLines.toList.par
  Console.println(words.filter(x => x.contains("dup")))

}
