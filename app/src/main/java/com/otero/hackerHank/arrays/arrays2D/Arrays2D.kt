package com.otero.hackerHank.arrays.arrays2D

class Arrays2D {

    companion object {
        const val FIRST_POS = 0
    }

    fun hourglassSum(arr: Array<Array<Int>>): Int {
        var startingCol = FIRST_POS
        var higherSum = Int.MIN_VALUE

        for (row in 0..3){
            for (col in 0..3){
                val currentCol = startingCol + col

                val upperHourGlassSum = arr[row].slice(currentCol..currentCol + 2).sum()
                val middleHourGlassSum = arr[row + 1][currentCol + 1]
                val bottomHourGlassSum = arr[row + 2].slice(currentCol..currentCol + 2).sum()

                val hourGlassSum = upperHourGlassSum + middleHourGlassSum + bottomHourGlassSum
                if(hourGlassSum > higherSum) higherSum = hourGlassSum
            }
            startingCol = FIRST_POS
        }

        return higherSum
    }

}
