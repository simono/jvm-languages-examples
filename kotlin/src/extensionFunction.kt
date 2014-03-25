fun List<String>.printFirst() {
    println(first)
}

fun testPrintFirst() {
    val list = listOf("Eins", "Zwei")
    list.printFirst()
}