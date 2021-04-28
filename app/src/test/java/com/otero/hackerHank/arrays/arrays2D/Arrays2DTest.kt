package com.otero.hackerHank.arrays.arrays2D

import org.junit.Assert.assertEquals
import org.junit.Test

class Arrays2DTest {

    @Test
    fun hourglassSum_arrayOfZeros_test() {

        val arr = Array(6) { Array(6) { 0 } }

        val hourGlassSum = Arrays2D().hourglassSum(arr)
        assertEquals(0, hourGlassSum)
    }

    @Test
    fun hourglassSum_sum7_test() {

        val arr = arrayOf(
            arrayOf(1, 1, 1, 0, 0, 0),  // 1 1 1 0 0 0
            arrayOf(0, 1, 0, 0, 0, 0),  // 0 1 0 0 0 0
            arrayOf(1, 1, 1, 0, 0, 0),  // 1 1 1 0 0 0
            arrayOf(0, 0, 0, 0, 0, 0),  // 0 0 0 0 0 0
            arrayOf(0, 0, 0, 0, 0, 0),  // 0 0 0 0 0 0
            arrayOf(0, 0, 0, 0, 0, 0),  // 0 0 0 0 0 0
        )

        val hourGlassSum = Arrays2D().hourglassSum(arr)
        assertEquals(7, hourGlassSum)
    }

    @Test
    fun hourglassSum_sum19_test() {

        val arr = arrayOf(
            arrayOf(1, 1, 1, 0, 0, 0),  // 1 1 1 0 0 0
            arrayOf(0, 1, 0, 0, 0, 0),  // 0 1 0 0 0 0
            arrayOf(1, 1, 1, 0, 0, 0),  // 1 1 1 0 0 0
            arrayOf(0, 0, 2, 4, 4, 0),  // 0 0 2 4 4 0
            arrayOf(0, 0, 0, 2, 0, 0),  // 0 0 0 2 0 0
            arrayOf(0, 0, 1, 2, 4, 0),  // 0 0 1 2 4 0
        )

        val hourGlassSum = Arrays2D().hourglassSum(arr)
        assertEquals(19, hourGlassSum)
    }

    @Test
    fun hourglassSum_sum28_test() {

        val arr = arrayOf(
            arrayOf(-9, -9, -9, 1, 1, 1),  // -9 -9 -9  1 1 1
            arrayOf(0, -9, 0, 4, 3, 2),    // 0 -9  0  4 3 2
            arrayOf(-9, -9, -9, 1, 2, 3),  // -9 -9 -9  1 2 3
            arrayOf(0, 0, 8, 6, 6, 0),     // 0  0  8  6 6 0
            arrayOf(0, 0, 0, -2, 0, 0),    // 0  0  0 -2 0 0
            arrayOf(0, 0, 1, 2, 4, 0),     // 0  0  1  2 4 0
        )

        val hourGlassSum = Arrays2D().hourglassSum(arr)
        assertEquals(28, hourGlassSum)
    }
}