name := "coupotest"

version := "1.0-SNAPSHOT"

lazy val `coupotest` = (project in file(".")).enablePlugins(PlayScala)

val reactiveMongoVer = "0.11.14"

resolvers += Resolver.sonatypeRepo("snapshots")

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
libraryDependencies += "com.h2database" % "h2" % "1.4.196"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"
libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.2.1"
libraryDependencies += "org.mongodb" %% "casbah" % "3.0.0"
libraryDependencies ++= Seq(
  jdbc ,
  ehcache ,
  ws ,
  specs2 % Test,
  guice
)



