package com.otero.hackerHank.arrays.minimumSwaps

class MinimumSwaps {

    fun minimumSwaps(array: Array<Int>): Int {
        var swap = 0
        array.forEachIndexed { index, value ->
            if(value != index + 1){
                var auxIndex = index
                while(array[auxIndex] != index + 1){
                    auxIndex++
                }
                var auxValue = array[index]
                array[index] = array[auxIndex]
                array[auxIndex] = auxValue
                swap++
            }
        }
        return swap
    }

    //  .     .
    //  4 2 1 3

    fun minimumSwapsPro(array: Array<Int>): Int {
        val isVisited = BooleanArray(array.size) { false }
        var swaps = 0

        for(index in array.indices){
            if(!isVisited[index]){
                isVisited[index] = true
                if(array[index] == index){
                    continue
                } else {
                    var newIndex = array[index]
                    while(!isVisited[newIndex - 1]){
                        isVisited[newIndex - 1] = true
                        newIndex = array[newIndex - 1]
                        swaps++
                    }
                }
            }
        }

        return swaps
    }

}
