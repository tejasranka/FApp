package com.example.firstapp

class lists {
    fun main() {
        val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)
        println("List: $numbers")
        println("Size: ${numbers.size}")
        println("First element is: ${numbers[0]}")
        println("Second element is: ${numbers[1]}")
        println("last  element is: ${numbers[numbers.size - 1]}")
        println("Last index is: ${numbers.size - 1}")

        val moreItems = listOf("pasta","momos","vada pav")
        val entries = mutableListOf<String>()//why giving parameter string necessary
        println("add noodles: ${entries.add("noodles")}")
        println("add spaghetti: ${entries.add("spaghetti")}")
        println("adding a list: ${entries.addAll(moreItems)}")
        //entries.add(10)
        println("Remove spaghetti: ${entries.remove("spaghetti")}")
        println("Remove rice: ${entries.remove("rice")}")
        println("Remove rice: ${entries.removeAt(0)}")
        println("Remove all/ clear list: ${entries.clear()}")



        println("Entries: $entries")
        println("empty? : ${entries.isEmpty()}")
    }

}