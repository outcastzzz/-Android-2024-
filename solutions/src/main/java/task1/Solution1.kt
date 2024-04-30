package task1

// [TASK]
// Определите дублированный элемент в массиве, в котором содержатся элементы типа int от 1 до 100,
// при условии, что в массиве дублируется только один элемент?

fun findDuplicate(arr: Array<Int>): Int {
    return arr.sum() - arr.distinct().sum()
}

fun findDuplicate2(arr: Array<Int>): Int {
    return arr.groupBy { it }.filter { it.value.size > 1 }.keys.first()
}