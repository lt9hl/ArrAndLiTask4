fun main() {
    var str = mutableListOf<String>()
    var str2 = mutableListOf<String>()
    try {
        str = (readln().split(", ")).toMutableList()
        str2 = (readln().split(", ")).toMutableList()
    } catch (e: Exception) {
        println("Введены неверные данные")
    }
    var arr1 = str.intersect(str2).toMutableList()
    for (i in arr1.indices) {
        var count = -0
        if (str.count { x -> x == arr1[i] } >= str.count { x -> x == arr1[i] }) {
            count = str.count { x -> x == arr1[i] }
        } else count = str.count { x -> x == arr1[i] }
        repeat(count - 1) { arr1.add(arr1[i]) }
    }
    arr1.sort()
    for (i in arr1) print("$i ")
}
/*Создать приложение, в котором пользователь дает на вход два числовых массива, числа в массиве могут повторяться.
На выходе приложение выдает пересечение этих массивов. Например, на входе [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3, 2, 2].
На выходе должны получить [1, 2, 2, 3]. То есть учитывается количество повторений чисел в массиве.
Число 2 в одном массиве повторялось два раза, в другом - три. Значит в итоговом массиве число два должно быть два раза*/
