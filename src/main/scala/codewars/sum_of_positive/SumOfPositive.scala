package codewars.sum_of_positive

object SumOfPositive {
  def positiveSum(arr: Array[Int]): Int = {
    var result = 0
    for (a <- arr if a > 0) result += a
    result
  }
}
