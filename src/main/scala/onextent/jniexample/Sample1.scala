package onextent.jniexample

import ch.jodersky.jni.nativeLoader

@nativeLoader("sample10")
class Sample1 {
  // --- Native methods
  @native def intMethod(n: Int): Int
  @native def booleanMethod(b: Boolean): Boolean
  @native def stringMethod(s: String): String
  @native def intArrayMethod(a: Array[Int]): Int
}

