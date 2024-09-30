fun main() {
    var str = (readln().split(", ")).toMutableList()
    var str2 = (readln().split(", ")).toMutableList()
    try {
        for (i in str) i.toInt()
        for (i in str2) i.toInt()
    } catch (e: Exception) {
        println("Введены неверные данные")
    }
    var li1 = str.intersect(str2).toMutableList()
    for (i in li1.indices) {
        var count = -0
        if (str.count { x -> x == li1[i] } >= str.count { x -> x == li1[i] }) {
            count = str.count { x -> x == li1[i] }
        } else count = str.count { x -> x == li1[i] }
        repeat(count - 1) { li1.add(li1[i]) }
    }
    li1.sort()
    println(li1.toString())
}
/*Создать приложение, в котором пользователь дает на вход два числовых массива, числа в массиве могут повторяться.
На выходе приложение выдает пересечение этих массивов. Например, на входе [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3, 2, 2].
На выходе должны получить [1, 2, 2, 3]. То есть учитывается количество повторений чисел в массиве.
Число 2 в одном массиве повторялось два раза, в другом - три. Значит в итоговом массиве число два должно быть два раза*/
