package codewars.bus

object Bus extends App {
  def number(busStops: List[(Int, Int)]): Int = {
    val res = {
      for (pair <- busStops) yield pair._1 - pair._2
    }.sum
    if (res <= 0) 0 else res
  }
}

object TrolleyBus {
  def number(busStops: List[(Int, Int)]): Int = {
    val res = busStops.map(x => x._1 - x._2).sum
    if (res > 0)
      res
    else 0
  }
}
