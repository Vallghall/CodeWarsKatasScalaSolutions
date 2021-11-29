package codewars.findtheoddint

object FindTheOddInt {
  def findOdd(xs: Seq[Int]): Int = {
    xs.filter(x => xs.count(_ == x) % 2 != 0).find(_ != 0) match {
      case Some(z) => z
      case None => 0
    }
  }
}
