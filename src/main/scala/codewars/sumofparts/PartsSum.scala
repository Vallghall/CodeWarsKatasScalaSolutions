package codewars.sumofparts

import scala.annotation.tailrec

object PartsSum extends App {
  def partsSums(l: List[Int]): List[Int] = {
      @tailrec
      def listSum(acc: List[Int], x: List[Int]): List[Int] = {
        if (x.nonEmpty)
          listSum(x.sum :: acc, x.tail)
        else
          (0 :: acc).reverse
      }
      listSum(List.empty[Int],l)
  }
  println(partsSums(List(0,1,3,6,10)))
}

object Kata {
  var acc = List.empty[Int]
  def partsSums(l: List[Int]): List[Int] = {
    if (l.nonEmpty) {
      acc = l.sum :: acc
      partsSums(l.tail)
    } else {
      (0 :: acc).reverse
    }
  }
}
