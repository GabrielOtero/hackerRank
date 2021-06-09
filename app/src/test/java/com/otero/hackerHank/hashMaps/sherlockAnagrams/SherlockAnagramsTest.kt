package com.otero.hackerHank.hashMaps.sherlockAnagrams

import org.junit.Assert.*
import org.junit.Test

class SherlockAnagramsTest {

    @Test
    fun abbaAnagramTest() {
        val anagrams = Sherlock().sherlockAndAnagrams("abba")
        assertEquals(4, anagrams)
    }

    @Test
    fun abcdAnagramTest() {
        val anagrams = Sherlock().sherlockAndAnagrams("abcd")
        assertEquals(0, anagrams)
    }

    @Test
    fun ifailuhkqqAnagramTest() {
        val anagrams = Sherlock().sherlockAndAnagrams("ifailuhkqq")
        assertEquals(3, anagrams)
    }

    @Test
    fun kkkkAnagramTest() {
        val anagrams = Sherlock().sherlockAndAnagrams("kkkk")
        assertEquals(10, anagrams)
    }

    @Test
    fun cdcdAnagramTest() {
        val anagrams = Sherlock().sherlockAndAnagrams("cdcd")
        assertEquals(5, anagrams)
    }

    @Test
    fun isAnagramTest(){
        assertTrue(Sherlock().isAnagram("ab", "ba"))
    }

    @Test
    fun isNotAnagramTest(){
        assertFalse(Sherlock().isAnagram("ab", "cd"))
    }

}
