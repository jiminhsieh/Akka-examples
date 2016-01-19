name := "ExampleApplication"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= {
  val akkaVersion = "2.4.1"

  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion
  )
}