package for_the_impatient.java_convertions

import scala.jdk.CollectionConverters.ListHasAsScala
import java.awt.datatransfer._

object JavaConvertions extends App {
  val flavors = SystemFlavorMap.
    getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
  val flavorBuffer = ListHasAsScala(flavors.getNativesForFlavor(DataFlavor.imageFlavor)).asScala
  println(flavorBuffer.mkString("\n"))
}

