# sbt-scalaprops

[![Build Status](https://travis-ci.org/scalaprops/sbt-scalaprops.svg?branch=master)](https://travis-ci.org/scalaprops/sbt-scalaprops)

sbt plugin for [scalaprops](https://github.com/scalaprops/scalaprops)

sbt-scalaprops provides `scalapropsOnly: InputKey[Unit]` command like `testOnly` but more powerful.
__powerful__ means not only test class names but also test method names and [params](https://github.com/scalaprops/sbt-scalaprops/commit/c50e82740382eac812be2647e3d1d0f2c192e113).

### latest stable version

`project/scalaprops.sbt`

```scala
addSbtPlugin("com.github.scalaprops" % "sbt-scalaprops" % "0.2.4")
```

#### JVM

`build.sbt`

```scala
scalapropsSettings

scalapropsVersion := "0.5.2"
```

or

```scala
scalapropsWithScalazlaws

scalapropsVersion := "0.5.2"
```

#### Scala.js

`build.sbt`

```scala
scalapropsCoreSettings

libraryDependencies += "com.github.scalaprops" %%% "scalaprops" % "0.5.2" % "test"
```

or

```scala
scalapropsCoreSettings

val scalapropsVersion = "0.5.2"

libraryDependencies += "com.github.scalaprops" %%% "scalaprops" % scalapropsVersion % "test"
libraryDependencies += "com.github.scalaprops" %%% "scalaprops-scalazlaws" % scalapropsVersion % "test"
```


- [API Documentation](https://oss.sonatype.org/service/local/repositories/releases/archive/com/github/scalaprops/sbt-scalaprops_2.10_0.13/0.2.4/sbt-scalaprops-0.2.4-javadoc.jar/!/index.html)


![screencast](https://raw.githubusercontent.com/scalaprops/sbt-scalaprops/master/screencast.gif)
