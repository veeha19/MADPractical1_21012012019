import java.util.Arrays
import java.util.*
fun main() {
    println("===Array-1===")
    val arr1 = arrayOf(1, 2, 3, 4)
    print("[")
    arr1.forEach { print(" $it ") }
    print("]\n")

    println("===Array-2===")
    val arr2 = arrayOf<Int>(1, 2, 3)
    print("[")
    arr2.forEach { print(" $it ") }
    print("]\n")
    print("[")
    println("===Array-3===")
    val arr3 = Array(5, { i -> i * 1 })
    arr3.forEach { print(" $it ") }
    print("]\n")
    println("===Array-4===")
    print("[")
    val arr4 = intArrayOf(1, 2, 3, 4)
    for (i in 0..arr4.size-1)
    {
        print(" ${arr4[i]} ")
    }
    print("]\n")
    println("===Array-5===")
    print("[")
    val arr5 = IntArray(5) { 10 * (it + 1) }
    for (i in 0..arr5.size-1)
    {
        print(" ${arr5[i]} ")
    }
    print("]\n")
    println("===Array-6===")
    val arr6 = arrayOf(intArrayOf(1, 2),intArrayOf(3, 4),intArrayOf(5, 6, 7))
    println(Arrays.deepToString(arr6))
    println("---Please Enter Array Values----")
    print("Size:-")
    val size = readLine()!!.toInt()
    var arr7 = Array<Int>(size) { readLine()!!.toInt() }
    println("---Entered Array---")
    print("[ ")
    print(arr7.joinToString())
    print(" ]\n")
    println("---With Built-in Function---")
    println("---After sorting by built-in function---")
    arr7.sort()
    print("[ ")
    print(arr7.joinToString())
    print(" ]\n")
    println("---without built-in function---")
    println("---After Sorting---")
    var temp = 0
    for (i in 0..arr7.size-1) {
        for (j in i+1..arr7.size-1)
        {
            if (arr7[i] > arr7[j])
            {
                temp = arr7[i];
                arr7[i] = arr7[j];
                arr7[j] = temp;
            }
        }
    }
    print("[ ")
    print(arr7.joinToString())
    print(" ]\n")
}