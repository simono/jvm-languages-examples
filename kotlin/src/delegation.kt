class MyList(
      l: List<String>): List<String> by l {

    fun printSize() {
        println(size())
    }
}