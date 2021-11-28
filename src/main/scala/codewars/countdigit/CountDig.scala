package codewars.countdigit

object CountDig {
  def nbDig(n: Int, d: Int): Int = {
    (for (k <- 0 to n) yield (k*k).toString).foldLeft(0)(_ + _.count(_ - '0' == d))
  }
}
