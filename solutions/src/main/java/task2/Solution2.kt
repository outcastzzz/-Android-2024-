package task2

// [TASK]
// Напишите код, подсчитывающий количество каждых элементов и выведите сначала элемент,
// а затем количество вхождений в массив.

fun countElements(arr: Array<Int>): Map<Int, Int> {
    return arr.groupBy { it }.mapValues { it.value.size }
}

fun countElements2(arr: Array<Int>): Map<Int, Int> {
    return arr.groupingBy { it }.eachCount()
}
