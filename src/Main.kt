fun main() {

    //Задача 1
    println("Пример выполнения решения задачи 1:\n" +
            filterMapByKeyLessThan(mapOf(1 to "1", 2 to "2", 3 to "3", 6 to "6", 10 to "10"), 5))

    //Задача 2
    println("Пример выполнения решения задачи 2:\n" +
            filterMapByValueEndingWith(
                mapOf(
                    1 to "Арбуз",
                    2 to "Банан",
                    3 to "Виноград",
                    4 to "Груша",
                    5 to "Дыня"), "а"))

    //Задача 3
    println("Пример выполнения решения задачи 3:\n" +
            filterMapByValueBeginningWith(
                mapOf(
                1 to "Геннадий",
                2 to "Сергей",
                3 to "Виктор"
            ), "Г"))

    //Задача 4
    val prizeMap = mapOf(11 to 15, 36 to 25, 195 to 30, 17 to 27, 5 to 21)
    println("Пример выполнения решения задачи 4:\n" +
            prizeMap.filter { it.key.toString().endsWith("5") && it.value > 20 })
}

fun filterMapByKeyLessThan(map: Map<Int, String>, number: Int) = map.filter { it.key < number }

fun filterMapByValueEndingWith(map: Map<Int, String>, letter: String): Map<Int, String> {
    return map.filter { it.value.endsWith(letter) }
}

fun filterMapByValueBeginningWith(map: Map<Int, String>, letter: String): Map<Int, String> {
    return map.filter { it.value.startsWith(letter) }
}