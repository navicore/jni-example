JNI Example
-----

Exploring the [sbt-jni](https://github.com/jodersky/sbt-jni) sbt plugin to
enable JNI programming with Scala.

Build and run via:
```console
sbt javah assembly
java -jar target/scala-2.12/JniExample-assembly-1.0.jar
```

Works well - I'm happy with the results:

  * scala app built in the root project
  * cpp native lib built in a sub-project dependency
  * root project superjar via JniPackage and assembly plugin contains native shared libs - ready to run

To bootstrap a new project, clone this repo or follow the instructions at
[sbt-jni](https://github.com/jodersky/sbt-jni).

----

###Todo: 

* cross compiling (macos, linux intel, linux arm (raspberry pi), ...
* giter8


