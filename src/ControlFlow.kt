fun main() {
    var names : MutableList<String> = mutableListOf("Peter", "Mark", "Alice", "Paul", "Lucas", "John")

    names.add("Joe")

    for (name in names) {
        if(name.equals("Lucas"))
            println("What are you doing here Lucas?")
        else
            println(name)
    }
}