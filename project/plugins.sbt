addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.14")
addSbtPlugin("com.github.sbt" % "sbt-release" % "1.1.0")
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.0")
libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.4.8")
Compile / unmanagedSourceDirectories += baseDirectory.value.getParentFile / "src" / "main" / "scala"

scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  Nil
)
