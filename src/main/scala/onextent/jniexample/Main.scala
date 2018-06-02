package onextent.jniexample

object Main {

  // --- Main method to test our native library
  def main(args: Array[String]): Unit = {
    val sample = new Sample1
    val square = sample.intMethod(5)
    val bool = sample.booleanMethod(true)
    val text = sample.stringMethod("java")
    val sum = sample.intArrayMethod(Array(1, 1, 2, 3, 5, 8, 13))

    println(s"intMethod: $square")
    println(s"booleanMethod: $bool")
    println(s"stringMethod: $text")
    println(s"intArrayMethod: $sum")
  }
}
