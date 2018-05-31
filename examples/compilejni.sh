scalac src/main/scala/onextent/jniexample/Sample1.scala
LIBS_HOME=/usr/local/Cellar/scala/2.12.6/libexec/lib
CP=$LIBS_HOME/scala-library.jar
javah -cp $CP:. onextent.jniexample.Sample1
