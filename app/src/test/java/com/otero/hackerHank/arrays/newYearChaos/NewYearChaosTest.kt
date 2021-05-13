package com.otero.hackerHank.arrays.newYearChaos

import org.junit.Assert.assertEquals
import org.junit.Test

class NewYearChaosTest {

    @Test
    fun noBribesTest() {
        val bribes = NewYearChaos().countMinimumBribes(arrayOf(1, 2, 3, 4, 5))
        assertEquals(0, bribes)
    }

    @Test
    fun oneBribesTest() {
        val bribes = NewYearChaos().countMinimumBribes(arrayOf(1, 2, 3, 5, 4))
        assertEquals(1, bribes)
    }

    @Test
    fun threeBribesTest() {
        val bribes = NewYearChaos().countMinimumBribes(arrayOf(2, 1, 5, 3, 4))
        assertEquals(3, bribes)
    }

    @Test
    fun tooChaoticBribesTest() {
        val bribes = NewYearChaos().countMinimumBribes(arrayOf(2, 5, 1, 3, 4))
        assertEquals(-1, bribes)
    }

    @Test
    fun sevenChaoticBribesTest() {
        val bribes = NewYearChaos().countMinimumBribes(arrayOf(1, 2, 5, 3, 7, 8, 6, 4))
        assertEquals(7, bribes)
    }


}