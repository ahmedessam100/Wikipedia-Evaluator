name := "Language Evaluator"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.4.5" % "provided"

libraryDependencies += "org.apache.hadoop" % "hadoop-streaming" % "2.7.0"

assemblyJarName in assembly := s"${name.value.replace(' ', '-')}-${version.value}.jar"

assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)