package com.otero.hackerHank.hashMaps.countTriplets

import org.junit.Assert.assertEquals
import org.junit.Test

class CountTripletsTest {

    @Test
    fun emptyArrayTest() {
        assertEquals(0, countTriplets(emptyArray(), 1))
    }

    @Test
    fun oneElementArrayTest() {
        assertEquals(0, countTriplets(arrayOf(1), 1))
    }

    @Test
    fun twoElementArrayTest() {
        assertEquals(0, countTriplets(arrayOf(1, 2), 1))
    }

    @Test
    fun oneTripletArrayTest() {
        assertEquals(1, countTriplets(arrayOf(1, 2, 4), 2))
    }

    @Test
    fun twoTripletsArrayTest() {
        assertEquals(2, countTriplets(arrayOf(1, 2, 4, 8), 2))
    }

    @Test
    fun twoTriplets_multipleElementsArrayTest() {
        assertEquals(2, countTriplets(arrayOf(1, 2, 2, 4), 2))
    }

    @Test
    fun sixTriplets_multipleElementsArrayTest() {
        assertEquals(6, countTriplets(arrayOf(1, 3, 9, 9, 27, 81), 3))
    }

    @Test
    fun sixTriplets_multipleElementsArrayTest2() {
        assertEquals(6, countTriplets(arrayOf(1, 3, 3, 9, 27, 27), 3))
    }

    @Test
    fun fiveTriplets_multipleElementsArrayTest2() {
        assertEquals(4, countTriplets(arrayOf(1, 5, 5, 25, 125), 5))
    }

    @Test
    fun sameValuesMultipleElementsArrayTest() {
        assertEquals(4, countTriplets(arrayOf(1, 1, 1, 1), 1))
    }

    @Test
    fun sameValuesMultipleElementsArrayTest2() {
        assertEquals(10, countTriplets(arrayOf(1, 1, 1, 1, 1), 1))
    }

    @Test
    fun sameValuesMultipleElementsArrayTest3() {
        assertEquals(166661666700000, countTriplets(Array(100000) { 1237 }, 1))
    }


    private fun countTriplets_fail(array: Array<Long>, f: Long): Long {
        if (array.size < 3)
            return 0

        var count = 0L

        for (i in 1..array.size - 2) {

            val elem = array[i]
            var contadorAnterior = 0
            var contadorPosterior = 0

            var j = i - 1
            while (j >= 0) {
                if (array[j] == elem / f) {
                    contadorAnterior++
                }
                j--
            }

            for (k in i + 1 until array.size) {
                if (array[k] == elem * f) {
                    contadorPosterior++
                }
            }

            count += contadorAnterior * contadorPosterior
        }

        return count
    }

    private fun countTriplets(array: Array<Long>, f: Long): Long {
        if (array.size < 3)
            return 0

        var count = 0L

        val leftHashMap = HashMap<Long, Long>()
        val rightHashMap = HashMap<Long, Long>()

        array.forEach {
            rightHashMap[it] = rightHashMap[it]?.plus(1) ?: 1
        }

        array.forEach { elem ->
            var leftCounter = 0L
            var rightCounter = 0L

            rightHashMap[elem] = rightHashMap[elem]?.minus(1) ?: 0

            if (leftHashMap.contains(elem / f) && (elem % f == 0L)) {
                leftCounter = leftHashMap[elem / f] ?: 0
            }

            if (rightHashMap.contains(elem * f)) {
                rightCounter = rightHashMap[elem * f] ?: 0
            }

            leftHashMap[elem] = leftHashMap[elem]?.plus(1) ?: 1

            count += leftCounter * rightCounter
        }

        return count
    }
}