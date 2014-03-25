case class Conference(name: String)

val javaLand = Conference("JavaLand")

javaLand match {
	case Conference("JavaLand") =>
		println("JavaLand!")
	case _ =>
		println("Default Case")
}
