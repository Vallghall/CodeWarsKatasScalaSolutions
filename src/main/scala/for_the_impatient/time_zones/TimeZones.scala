package for_the_impatient.time_zones

import java.util.TimeZone.getAvailableIDs

object TimeZones extends App {
  val timeZones = for (zone <- getAvailableIDs if zone.contains("America/")) yield zone.substring(8)
  println(timeZones.mkString("\n"))
}
