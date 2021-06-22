package com.otero.hackerHank.sorting.bubbleSort

import org.junit.Assert.assertEquals
import org.junit.Test

class BubbleSortTest {

    @Test
    fun sortedArrayTest() {
        val arr = arrayOf(1, 2, 3)

        assertEquals(0, countNumSwaps(arr))
    }

    @Test
    fun oneSwapArrayTest() {
        val arr = arrayOf(1, 3, 2)

        val numSwaps = countNumSwaps(arr)

        assertEquals(1, numSwaps)
        assertEquals(
            "Array is sorted in 1 swaps.",
            "Array is sorted in $numSwaps swaps."
        )

        assertEquals(
            "First Element: 1",
            "First Element: ${arr.first()}"
        )

        assertEquals(
            "Last Element: 3",
            "Last Element: ${arr.last()}"
        )

    }

    fun countNumSwaps(arr: Array<Int>): Int {
        var swapCount = 0
        for (i in 0 until arr.size) {
            for (j in 0 until arr.size - 1) {
                if (arr[j] > arr[j + 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                    swapCount++
                }
            }
        }
        return swapCount
    }

}