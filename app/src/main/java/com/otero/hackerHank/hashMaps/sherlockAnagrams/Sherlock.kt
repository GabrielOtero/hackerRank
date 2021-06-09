package com.otero.hackerHank.hashMaps.sherlockAnagrams

class Sherlock {


    fun sherlockAndAnagrams_fail(s: String): Int {
        var count: Int = 0
        val substrings = mutableListOf<String>()
        for (i in 0..s.length) {
            for (j in i + 1..s.length) {
                val substring = s.substring(i, j)
                substrings.add(substring)
            }
        }

        for (i in 0 until substrings.size) {
            for (j in i + 1 until substrings.size) {
                if (isAnagram(substrings[i], substrings[j])) {
                    count++
                }
            }
        }
        return count
    }

    fun isAnagram(s1: String, s2: String): Boolean {
        return s1.toCharArray().sorted().joinToString("").equals(
            s2.toCharArray().sorted().joinToString("")
        )
    }

    fun sherlockAndAnagrams(s: String): Int {
        val substrings = hashMapOf<String, Int>()
        for (i in 0..s.length) {
            for (j in i + 1..s.length) {
                val substring = s.substring(i, j)
                val sortedSubstring = substring.toCharArray().sorted().joinToString("")
                substrings[sortedSubstring] = substrings[sortedSubstring]?.plus(1) ?: 1
            }
        }

        return substrings.values.sumBy { (it * (it - 1)) / 2 }
    }

}
