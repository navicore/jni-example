name := "JniExample"

version := "1.0"

scalaVersion := "2.12.17"

libraryDependencies ++=
  Seq(

    "org.scalatest" %% "scalatest" % "3.2.14" % "test"

  )

lazy val main = Project(id = "JniExample", base = file(".")).dependsOn(native % Runtime)

lazy val native = (project in file("native")).
  settings(sourceDirectory in nativeCompile := sourceDirectory.value).
  enablePlugins(JniNative)

