JNI Example
-----

exploring the [sbt-jni](https://github.com/jodersky/sbt-jni) sbt plugin to
enable JNI programming with Scala

```console
sbt javah assembly
java -jar target/scala-2.12/JniExample-assembly-1.0.jar
```

This works well.

  * scala app built in the root project
  * cpp native lib built in a sub-project
  * root project superjar via JniPackage and assembly plugin contains native shared libs

To bootstrap a new project, clone this repo or follow the instructions at
[sbt-jni](https://github.com/jodersky/sbt-jni).

----
Todo: cross compiling (macos, linux intel, linux arm (raspberry pi), ...
Todo: giter8


