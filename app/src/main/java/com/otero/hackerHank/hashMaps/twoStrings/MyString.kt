package com.otero.hackerHank.hashMaps.twoStrings

class MyString {

    fun twoStrings(s1: String, s2: String): String {
        return if(hasSubsString(s1,s2))
            "YES"
        else
            "NO"
    }

    fun hasSubsStringFailed(s1: String, s2: String): Boolean {
        for(i in s1.indices){
            for(j in i + 1..s1.length)
                if(s2.contains(s1.substring(i, j)))
                    return true
        }
        return false
    }

    fun hasSubsStringFailed2(s1: String, s2: String): Boolean {
        for(c in s1){
            if(s2.contains(c)) return true
        }
        return false
    }

    fun hasSubsString(s1: String, s2: String): Boolean {
        val hashSet1 = HashSet<Char>()
        val hashSet2 = HashSet<Char>()

        for(c in s1){
            hashSet1.add(c)
        }

        for(c in s2){
            hashSet2.add(c)
        }

        hashSet1.retainAll(hashSet2)

        return hashSet1.isNotEmpty()
    }

}
