package com.otero.hackerHank.hashMaps.ransomNote

class RansomNote {

    fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
        if(assertMagazine(magazine, note))
            println("Yes")
        else
            println("No")
    }

    fun assertMagazine(magazine: Array<String>, note: Array<String>): Boolean {
        if(note.isEmpty())
            return true

        val wordCount: HashMap<String, Int> = HashMap()
        for (word in magazine) {
            val count = wordCount[word] ?: 0
            wordCount[word] = count + 1
        }

        for (word in note) {
            if(!wordCount.containsKey(word) || wordCount[word] == 0){
                return false
            }
            val count = wordCount[word] ?: 0
            wordCount[word] = count - 1
        }

        return true
    }
}