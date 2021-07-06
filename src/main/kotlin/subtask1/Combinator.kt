package subtask1

class Combinator {


    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]
        var result: Int? = null

        for (i in 1..n) {
            if (m <= factorial(n) / (factorial(i) * factorial(n - i))) {
                result = i
                break
            }
        }

        return result
    }

    fun factorial(n: Int): Double = if (n < 2) 1.0 else n * factorial(n - 1)
}
