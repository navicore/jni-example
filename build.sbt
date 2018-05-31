name := "JniExample"

version := "1.0"

scalaVersion := "2.12.6"

libraryDependencies ++=
  Seq(

    "org.typelevel" %% "cats-core" % "1.0.1",
    "com.chuusai" %% "shapeless" % "2.3.2",
    "io.github.mkotsur" %% "aws-lambda-scala" % "0.0.10",

    "org.scalatest" %% "scalatest" % "3.0.5" % "test"

  )

lazy val root = (project in file(".")).
  aggregate(core, native)

lazy val core = (project in file("core")).
  dependsOn(native % Runtime)

lazy val native = (project in file("native")).
  settings(sourceDirectory in nativeCompile := sourceDirectory.value).
  enablePlugins(JniNative)

/* mainClass in assembly := Some("onextent.jniexample.Main") */
/* assemblyJarName in assembly := "JniExample.jar" */
/*  */
/* assemblyMergeStrategy in assembly := { */
/*   case PathList("reference.conf") => MergeStrategy.concat */
/*   case x if x.endsWith("io.netty.versions.properties") => MergeStrategy.first */
/*   case PathList("META-INF", _ @ _*) => MergeStrategy.discard */
/*   case _ => MergeStrategy.first */
/* } */
/*  */
