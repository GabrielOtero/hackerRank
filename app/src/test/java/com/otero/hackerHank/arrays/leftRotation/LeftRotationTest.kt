package com.otero.hackerHank.arrays.leftRotation

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class LeftRotationTest {

    @Test
    fun arrayOfZerosWithZeroShift() {
        val rot = Arrays.rotLeft(arrayOf(0, 0, 0), 0)
        val expected = arrayOf(0, 0, 0)
        assertArrayEquals(expected, rot)
    }

    @Test
    fun arrayWithZeroShift() {
        val rot = Arrays.rotLeft(arrayOf(1, 2, 3, 4, 5), 4)
        val expected = arrayOf(5, 1, 2, 3, 4)
        assertArrayEquals(expected, rot)
    }

}