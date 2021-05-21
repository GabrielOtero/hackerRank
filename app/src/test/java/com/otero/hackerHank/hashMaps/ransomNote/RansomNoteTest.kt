package com.otero.hackerHank.hashMaps.ransomNote

import org.junit.Assert
import org.junit.Test

class RansomNoteTest {

    @Test
    fun emptyMagazineAndEmptyNoteTest(){
        val isPossible = RansomNote()
            .assertMagazine(emptyArray(), emptyArray())
        Assert.assertTrue(isPossible)
    }

    @Test
    fun emptyMagazineAndNotEmptyNoteTest(){
        val isPossible = RansomNote()
            .assertMagazine(emptyArray(), arrayOf("word"))
        Assert.assertFalse(isPossible)
    }

    @Test
    fun oneWordMagazineAndOneWordNoteTest(){
        val isPossible = RansomNote()
            .assertMagazine(arrayOf("word"), arrayOf("word"))
        Assert.assertTrue(isPossible)
    }

    @Test
    fun oneWordMagazineDifferentFromNote(){
        val isPossible = RansomNote()
            .assertMagazine(arrayOf("apple"), arrayOf("word"))
        Assert.assertFalse(isPossible)
    }

    @Test
    fun multipleWordMagazineAndMultipleWordNoteTest(){
        val isPossible = RansomNote().assertMagazine(
            arrayOf("give", "me", "one" , "grand", "today", "night"),
            arrayOf("give", "one" , "grand", "today")
        )
        Assert.assertTrue(isPossible)
    }

    @Test
    fun multipleWordMagazineAndDifferentMultipleWordNoteTest(){
        val isPossible = RansomNote().assertMagazine(
            arrayOf("two", "times", "three" , "is", "not", "four"),
            arrayOf("two", "times" , "two", "is", "four")
        )
        Assert.assertFalse(isPossible)
    }
    @Test
    fun multipleWordMagazineAndDifferentMultipleWordNoteTest2(){
        val isPossible = RansomNote().assertMagazine(
            arrayOf("ive", "got", "a" , "lovely", "bunch", "of", "coconuts"),
            arrayOf("ive", "got" , "some", "coconuts")
        )
        Assert.assertFalse(isPossible)
    }

}