package com.otero.hackerHank.arrays.arrayManipulation

import org.junit.Assert.assertEquals
import org.junit.Test

class ArrayManipulationTest {

    @Test
    fun noOperationTest() {
        val maxValue = ArrayManipulation().arrayManipulationPro(5, emptyArray())
        assertEquals(0, maxValue)
    }

    @Test
    fun onlyOneOperationTest() {
        val queries = arrayOf(arrayOf(1, 2, 10))
        val maxValue = ArrayManipulation().arrayManipulationPro(5, queries)
        assertEquals(10, maxValue)
    }

    @Test
    fun tenOperationTest() {
        val queries = arrayOf(arrayOf(1, 5, 3), arrayOf(4, 8, 7), arrayOf(6, 9, 1))
        val maxValue = ArrayManipulation().arrayManipulationPro(10, queries)
        assertEquals(10, maxValue)
    }

    @Test
    fun queryOnEdgeOneOperationTest() {
        val queries = arrayOf(arrayOf(3, 5, 10))
        val maxValue = ArrayManipulation().arrayManipulationPro(5, queries)
        assertEquals(10, maxValue)
    }

}
