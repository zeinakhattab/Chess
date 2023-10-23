val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "asgn1",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies +=
      "org.scalatest" %% "scalatest" % "3.2.11" % Test
  )
