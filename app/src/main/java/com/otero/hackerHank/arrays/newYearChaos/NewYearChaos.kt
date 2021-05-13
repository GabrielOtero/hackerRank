package com.otero.hackerHank.arrays.newYearChaos

import java.util.Collections.swap

const val TOO_CHAOTIC = -1
const val FIRST_POS = 0

class NewYearChaos {

    fun minimumBribes(array: Array<Int>): Unit {
        val bribes = countMinimumBribes(array)
        if(bribes == -1){
            println("Too chaotic")
        } else {
            println(bribes)
        }
    }

    fun countMinimumBribes(array: Array<Int>) : Int {
        var bribes = 0

        val rollerCoasterRide = array.toMutableList()
        for(index in rollerCoasterRide.indices.reversed()) {
            val value = rollerCoasterRide[index]
            val originalValue = index + 1
            if(value != originalValue){
                if(hasMoreThan3Bribes(value, index))
                    return TOO_CHAOTIC

                if(index - 1 >= FIRST_POS && originalValue == rollerCoasterRide[index - 1]){
                    bribes++
                    swap(rollerCoasterRide, index - 1, index)
                }

                if(index - 2 >= FIRST_POS && originalValue == rollerCoasterRide[index - 2]){
                    bribes += 2
                    swap(rollerCoasterRide, index - 2, index - 1)
                    swap(rollerCoasterRide, index - 1, index)
                }
            }
        }
        return bribes
    }

    private fun hasMoreThan3Bribes(value: Int, index: Int) = value - index > 3

}