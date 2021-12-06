fun main() {
    var names : MutableList<String> = mutableListOf("Peter", "Mark", "Alice", "Paul", "Lucas", "John")

    names.add("Joe")
    names.add("Alex")

    for (name in names) {
        if(name.equals("Lucas"))
            println("What are you doing here $name?")
        else if (name.startsWith("A"))
            println("Your name starts with a A $name?")
        else
            println(name)
    }
}