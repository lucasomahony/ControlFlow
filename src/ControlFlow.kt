fun main() {
    var names : ArrayList<String> = ArrayList();


    names.add("Peter")
    names.add("Mark")
    names.add("Alice")
    names.add("Paul")
    names.add("Lucas")
    names.add("John")

    for (name in names) {
        println(name)
    }

    var x : Array<String> = arrayOf("a", "b", "c")

    for (i in x)
        println(i)

}