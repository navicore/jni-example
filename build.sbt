name := "JniExample"

version := "1.0"

scalaVersion := "2.12.6"

libraryDependencies ++=
  Seq(

    "org.scalatest" %% "scalatest" % "3.0.5" % "test"

  )

lazy val main = Project(id = "JniExample", base = file(".")).dependsOn(native % Runtime)

lazy val native = (project in file("native")).
  settings(sourceDirectory in nativeCompile := sourceDirectory.value).
  enablePlugins(JniNative)

