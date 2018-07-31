scalapropsWithScalazlaws

scalapropsVersion := System.getProperty("scalaprops.version")

crossScalaVersions := "2.11.12" :: "2.10.7" :: Nil

scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-Xlint" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  Nil
)
