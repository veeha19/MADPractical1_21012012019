fun findmaxnum(arr:Array<Int>) {
    var maxx = arr[0]
    var count = 0
    for (i in arr) {
        println("a[$count] = $i")
        if (i > maxx) {
            maxx = i
        }
        count++
    }
    println(maxx)
}
    fun main()
    {
        var arr = arrayOf(57, 90, 10, 13, 5, 14)
        findmaxnum(arr)

    }
