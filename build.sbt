ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.4.2"

lazy val root = (project in file("."))
  .settings(
    name := "Learningg",
    libraryDependencies ++= Seq(
      "org.scalafx" %% "scalafx" % "20.0.0-R30"
    )
  )
