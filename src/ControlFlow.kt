fun main() {
    var names : MutableList<String> = mutableListOf("Peter", "Mark", "Alice", "Paul", "Lucas", "John")

    names.add("Joe")

    for (name in names) {
        println(name)
    }
}