package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {

        var result: Array<Int>? = null

        for (i in number - 1 downTo 2) {
            var square: Long = number.toLong() * number.toLong()
            result = scissors(i, square)
            if (result != null) break
        }

        return result
    }


    private fun scissors(i: Int, square: Long): Array<Int>? {
        val num: Long = i.toLong() * i.toLong()
        if (num == square) {
            return arrayOf(i)
        } else if (num < square) {
            val square1 = square - num

            for (j in i - 1 downTo 1) {
                val res = scissors(j, square1)
                if (res != null) {
                    return res.plus(i)
                } else {
                    continue
                }
            }
        } else return null

        return null
    }


}