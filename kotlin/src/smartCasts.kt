fun double(a: Any): Int {
    if (a is Int) {
        return a * 2
    }
    return 0
}