package com.otero.hackerHank.arrays.arrayManipulation

class ArrayManipulation {
    fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {
        val array = LongArray(n) { 0 }

        queries.forEach {
            for (i in it[0] - 1 until it[1]) {
                array[i] += it[2].toLong()
            }
        }

        var maxValue = 0L
        array.forEach {
            if (it > maxValue) {
                maxValue = it.toLong()
            }
        }

        return maxValue
    }

    fun arrayManipulationPro(n: Int, queries: Array<Array<Int>>): Long {
        val array = LongArray(n) { 0 }

        queries.forEach { query ->
            array[query[0] - 1] += query.last().toLong()
            if(query[1] < array.size)
                array[query[1]] -= query.last().toLong()
        }


        var sum = 0L
        var maxSum = 0L

        array.forEach {
            sum += it

            if(sum > maxSum)
                maxSum = sum
        }

        return maxSum
    }

}

//1 5 3
//4 8 7
//6 9 1
//
//[3, 3, 3, 10,10, 8, 8, 8, 1,  0]
//[3, 0, 0, 7, 7, -2, 0, 0, 1, -1]