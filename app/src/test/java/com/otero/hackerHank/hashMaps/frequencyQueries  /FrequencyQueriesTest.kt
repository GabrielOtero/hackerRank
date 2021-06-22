package com.otero.hackerHank.hashMaps.`frequencyQueries  `

import org.junit.Assert.assertArrayEquals
import org.junit.Test
import java.util.*
import kotlin.collections.HashMap

const val INSERT = 1
const val DELETE = 2
const val CHECK = 3

class FrequencyQueriesTest {

    private fun freqQuery(queries: Array<Array<Int>>): Array<Int> {
        if (queries.isEmpty())
            return emptyArray()

        val operations = hashMapOf<Int, Int>()
        val result = mutableListOf<Int>()
        val frequencies = IntArray(queries.size + 1) { 0 }

        queries.forEach {
            val query = it[0]
            val param = it[1]

            when (query) {
                INSERT -> insert(operations, param, frequencies)
                DELETE -> delete(operations, param, frequencies)
                CHECK -> check(param, result, frequencies)
            }
        }
        return result.toTypedArray()
    }

    private fun check(
        param: Int,
        result: MutableList<Int>,
        frequencies: IntArray
    ) {
        if (param > frequencies.size)
            result.add(0)
        else
            result.add(if (frequencies[param] > 0) 1 else 0)
    }

    private fun delete(
        operations: HashMap<Int, Int>,
        param: Int,
        frequencies: IntArray
    ) {
        val freq = operations[param] ?: 0
        val newFreq = freq - 1

        if (freq > 0) {
            operations[param] = newFreq

            frequencies[freq]--
            frequencies[newFreq]++
        }

    }

    private fun insert(
        operations: HashMap<Int, Int>,
        param: Int,
        frequencies: IntArray
    ) {
        val freq = operations[param] ?: 0
        val newFreq = freq + 1

        operations[param] = newFreq

        frequencies[freq]--
        frequencies[newFreq]++
    }

    @Test
    fun emptyArrayTest() {
        assertArrayEquals(emptyArray(), freqQuery(emptyArray()))
    }

    @Test
    fun oneInsertOperationTest() {
        assertArrayEquals(emptyArray(), freqQuery(arrayOf(arrayOf(INSERT, 1))))
    }

    @Test
    fun oneInsert_OneCheckOperationTest() {
        assertArrayEquals(arrayOf(1), freqQuery(arrayOf(arrayOf(INSERT, 1), arrayOf(CHECK, 1))))
    }

    @Test
    fun oneInsert_OneCheckOperation_failTest() {
        assertArrayEquals(arrayOf(0), freqQuery(arrayOf(arrayOf(INSERT, 1), arrayOf(CHECK, 2))))
    }

    @Test
    fun oneInsert_OneCheckOperation_failTest2() {
        assertArrayEquals(arrayOf(0), freqQuery(arrayOf(arrayOf(INSERT, 1), arrayOf(CHECK, 10))))
    }

    @Test
    fun twoInserts_OneDelete_OneCheckOperation_failTest() {
        assertArrayEquals(
            arrayOf(1), freqQuery(
                arrayOf(
                    arrayOf(INSERT, 1),
                    arrayOf(INSERT, 1),
                    arrayOf(DELETE, 1),
                    arrayOf(CHECK, 1)
                )
            )
        )
    }

}


