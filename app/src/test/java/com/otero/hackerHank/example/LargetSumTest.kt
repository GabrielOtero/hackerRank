package com.otero.hackerHank.example

import org.junit.Assert.assertEquals
import org.junit.Test

// Largest Sum Contiguous Array
// [1, 3, -4, 5, 7]


class LargetSumTest {

    @Test
    fun emptyArrayTest(){
        assertEquals(0,largetSumSubArray(emptyArray()))
    }

    @Test
    fun oneElementArrayTest(){
        assertEquals(1,largetSumSubArray(arrayOf(1)))
    }

    @Test
    fun twoElementsArrayTest(){
        assertEquals(3,largetSumSubArray(arrayOf(1, 2)))
    }

    @Test
    fun negativeElementsArrayTest(){
        assertEquals(3,largetSumSubArray(arrayOf(1, 2, -1)))
    }

    @Test
    fun negativeMultiplesElementsArrayTest(){
        assertEquals(7,largetSumSubArray(arrayOf(1, 2, -1, 4 , 3)))
    }

    private fun largetSumSubArray(array: Array<Int>): Int {
        if(array.isEmpty())
            return 0
        var maxSum = Int.MIN_VALUE
        var sum = 0
        array.forEach {
            sum += it
            if(it < 0)
                sum = 0
            if(sum > maxSum){
                maxSum = sum
            }
        }
        return maxSum
    }
}