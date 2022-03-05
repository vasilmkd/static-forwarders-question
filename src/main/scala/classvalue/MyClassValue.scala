package classvalue

object MyClassValue extends ClassValue[String] {
  override def computeValue(`type`: Class[_]): String = ???
}
