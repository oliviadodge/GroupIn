package com.willbeing.groupin

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class PersonTest {

    @Test
    fun `person name`() {
        val person = Person(name = "Josep")
        assertEquals("Josep", person.name)
    }

    @Test
    fun `person's friends`() {
        val person = Person(name = "Ronald", friends = listOf(
            Person("Josiah"),
            Person("Merrill"),
            Person("Snoop Dog"),
            Person("Jordan")
        ))

        assert(person.friends!!.size == 4)
    }
}