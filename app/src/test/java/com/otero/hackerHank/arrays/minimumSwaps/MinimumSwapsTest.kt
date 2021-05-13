package com.otero.hackerHank.arrays.minimumSwaps

import org.junit.Assert
import org.junit.Test

class MinimumSwapsTest {

    @Test
    fun zeroSwapsTest() {
        val swaps = MinimumSwaps().minimumSwapsPro(arrayOf(1, 2, 3, 4))
        Assert.assertEquals(0, swaps)
    }

    @Test
    fun oneSwapsTest() {
        val swaps = MinimumSwaps().minimumSwapsPro(arrayOf(2, 1, 3, 4))
        Assert.assertEquals(1, swaps)
    }

    @Test
    fun twoSwapsTest() {
        val swaps = MinimumSwaps().minimumSwapsPro(arrayOf(4,2,1,3))
        Assert.assertEquals(2, swaps)
    }

    @Test
    fun threeSwapsTest() {
        val swaps = MinimumSwaps().minimumSwapsPro(arrayOf(2, 3, 4, 1, 5))
        Assert.assertEquals(3, swaps)
    }

    @Test
    fun fiveSwapsTest() {
        val swaps = MinimumSwaps().minimumSwapsPro(arrayOf(7, 1, 3, 2, 4, 5, 6))
        Assert.assertEquals(5, swaps)
    }
}