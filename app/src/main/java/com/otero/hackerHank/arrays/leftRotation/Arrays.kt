package com.otero.hackerHank.arrays.leftRotation

object Arrays {

    fun rotLeft(array: Array<Int>, shift: Int): Array<Int> {
        val newArray = array.clone()
        array.forEachIndexed { index, i ->
            var newIndex = (index - shift + array.size) % array.size
            newArray[newIndex] = i
        }
        return newArray
    }

}
