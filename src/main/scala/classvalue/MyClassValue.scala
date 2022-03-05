package classvalue

class MyClassValue extends ClassValue[String] {
  override def computeValue(`type`: Class[_]): String = ???
}
