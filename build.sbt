name := "ConsistencyLevelRepro"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies += cache
libraryDependencies += ws
libraryDependencies += filters
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.17"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence" % "2.4.17"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence-cassandra" % "0.25"

