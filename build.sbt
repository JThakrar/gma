name := "gma"

maintainer := "Jayesh Thakrar"

version := "1.0"

scalaVersion := "2.11.8"

val scalaTestVersion = "3.0.4"
val sparkVersion = "2.2.1"

enablePlugins(JavaAppPackaging)

libraryDependencies += "org.scalatest" %% "scalatest" % scalaTestVersion % Test
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion % "provided"
