
name := "grazScala"

version := "0.1"

scalaVersion := "2.12.8"

enablePlugins(JavaAppPackaging)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.5",
  "org.apache.commons" % "commons-lang3" % "3.5"
)