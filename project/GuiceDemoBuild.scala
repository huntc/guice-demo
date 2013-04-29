import sbt._
import sbt.Keys._

object GuiceDemoBuild extends Build {

  lazy val guiceDemo = Project(
    id = "guice-demo",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Guice Demo",
      organization := "com.typesafe.guice",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.0",
      libraryDependencies += "org.specs2" %% "specs2" % "1.14" % "test",
      libraryDependencies += "org.mockito" % "mockito-core" % "1.9.5" % "test",
      libraryDependencies += "com.google.inject" % "guice" % "3.0",
      libraryDependencies += "javax.inject" % "javax.inject" % "1"
    )
  )
}
