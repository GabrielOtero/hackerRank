package com.otero.hackerHank.hashMaps.twoStrings

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class TwoStringsTest {

    @Test
    fun twoCharacterAreTheSameTest() {
        val hasSubstring = MyString().hasSubsString("a", "a")
        assertTrue(hasSubstring)
    }

    @Test
    fun twoCharacterAreDifferentTest() {
        val hasSubstring = MyString().hasSubsString("a", "b")
        assertFalse(hasSubstring)
    }

    @Test
    fun twoStringAreTheSameTest() {
        val hasSubstring = MyString().hasSubsString("aaa", "aaa")
        assertTrue(hasSubstring)
    }

    @Test
    fun twoStringAreDiffTest() {
        val hasSubstring = MyString().hasSubsString("aaa", "bbb")
        assertFalse(hasSubstring)
    }

    @Test
    fun oneStringIsSubStringOfAnother() {
        val hasSubstring = MyString().hasSubsString("a", "aaa")
        assertTrue(hasSubstring)
    }

    @Test
    fun oneStringIsSubStringOfAnother2() {
        val hasSubstring = MyString().hasSubsString("Celezte", "Cansado")
        assertTrue(hasSubstring)
    }

    @Test
    fun oneStringIsNotSubStringOfAnother() {
        val hasSubstring = MyString().hasSubsString("hi", "word")
        assertFalse(hasSubstring)
    }

}