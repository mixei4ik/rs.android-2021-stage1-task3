package subtask3

class TelephoneFinder {


    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {



/*        val phoneTable = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6),
            arrayOf(7, 8 , 9),
            arrayOf(null, 0, null)
        )*/

        var resultMutableListString = MutableList<String>(0, {""})

        fun neighborsNumbers(number: Int): Array<Int> {
            return when(number) {
                0 -> arrayOf(8)
                1 -> arrayOf(2, 4)
                2 -> arrayOf(1, 3, 5)
                3 -> arrayOf(2, 6)
                4 -> arrayOf(1, 5, 7)
                5 -> arrayOf(2, 4, 6, 8)
                6 -> arrayOf(3, 5, 9)
                7 -> arrayOf(4, 8)
                8 -> arrayOf(5, 7, 9, 0)
                9 -> arrayOf(6, 8)
                else -> arrayOf()
            }

/*            var result = MutableList(0, {0})
            for (i in phoneTable.indices) {
                for (j in phoneTable[i].indices) {
                    if (phoneTable[i][j] == number) {
                        if (i != 0 && phoneTable[i - 1][j] != null) result.add(phoneTable[i - 1][j]!!)
                        if (i != phoneTable.size && phoneTable[i + 1][j] != null) result.add(
                            phoneTable[i + 1][j]!!
                        )
                        if (j != 0 && phoneTable[i][j - 1] != null) result.add(phoneTable[i][j - 1]!!)
                        if (j != phoneTable[i].size && phoneTable[i][j + 1] != null) result.add(
                            phoneTable[i][j + 1]!!
                        )
                    }
                }
            }

            return result.toTypedArray()*/
        }

        if (number[0] == '-') return null
        val numArrayInt = number.map { it.toString().toInt() }

        for (i in numArrayInt.indices) {
            val neighborsArray = neighborsNumbers(numArrayInt[i])
                for (j in neighborsArray.indices) {
                    var neighborsNumber = numArrayInt.toMutableList()
                    neighborsNumber[i] = neighborsArray[j]
                    var neighborsString = ""
                    for (k in neighborsNumber.indices) {
                        neighborsString += "${neighborsNumber[k]}"
                    }
                    resultMutableListString.add(neighborsString)
                }
        }

        return resultMutableListString.toTypedArray()
    }
}
