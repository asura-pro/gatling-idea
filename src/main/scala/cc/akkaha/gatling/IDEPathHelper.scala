package cc.akkaha.gatling

import java.nio.file.Path

import io.gatling.commons.util.PathHelper._

object IDEPathHelper {

  val gatlingConfUrl: Path = getClass.getClassLoader.getResource("gatling.conf")
  val projectRootDir = gatlingConfUrl.ancestor(4)
  val projectTargetScalaDir = gatlingConfUrl.ancestor(2)

  val sbtSourcesDirectory = projectRootDir / "src" / "main" / "scala"
  val sbtResourcesDirectory = projectRootDir / "src" / "main" / "resources"
  val sbtTargetDirectory = projectTargetScalaDir.ancestor(1)
  val sbtBinariesDirectory = sbtTargetDirectory / "test-classes"

  val resourcesDirectory = sbtResourcesDirectory
  val simulationsDirectory = sbtSourcesDirectory / "simulations"
  val resultsDirectory = sbtTargetDirectory / "gatling"
  val recorderConfigFile = sbtResourcesDirectory / "recorder.conf"
}
