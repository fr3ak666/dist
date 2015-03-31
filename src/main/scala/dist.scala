/**
 * Created by fr3ak on 3/31/15.
 */


object dist extends App {

  val fst = (1 until 10000000 par) map (x => x*2) map (x => x / 3) map (x => x % 100000) reduce((a, b) => if(b%3==0) a+b else a-b)
  println(fst)
}
