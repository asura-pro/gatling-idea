import Dependencies._

enablePlugins(GatlingPlugin)

lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      organization := "cc.akkaha",
      scalaVersion := "2.12.8",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "gatling-idea",
    libraryDependencies ++= gatling
  )
