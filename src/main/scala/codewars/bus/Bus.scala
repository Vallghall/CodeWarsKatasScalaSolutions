package codewars.bus

object Bus extends App {
  def number(busStops: List[(Int, Int)]): Int = {
    val temp = for (pair <- busStops) yield pair._1 - pair._2
    val res = temp.sum
    if (res <= 0) 0 else res
  }
}