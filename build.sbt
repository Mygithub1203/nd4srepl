name := "nd4jrepl"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "org.nd4j" % "nd4s_2.11" % "0.4-rc3.8"
libraryDependencies += "org.nd4j" % "nd4j-x86" % "0.4-rc3.8"
libraryDependencies += "com.lihaoyi" % "ammonite-repl" % "0.5.2" % "test" cross CrossVersion.full

initialCommands in (Test, console) := """ammonite.repl.Main.run("")"""
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

