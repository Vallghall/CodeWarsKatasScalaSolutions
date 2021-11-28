package codewars.ursquare

object Sol {

  def isSquare(x: Int): Boolean = {
    val sqrt = math.sqrt(x)
    sqrt == sqrt.floor
  }
}
