package com.group.libraryapp.calculator

import com.group.libraryapp.practice.Person
import org.assertj.core.api.Assertions.assertThat
import org.hibernate.loader.CollectionAliases
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException

class JunitCalculatorTest {

    @Test
    fun addTest(){
        // given
        val calculator = Calculator(5)

        // when
        calculator.add(5)

        // then
        assertThat(calculator.number).isEqualTo(10);
    }

    @Test
    fun listTest(){
        //given
        val people = listOf(Person("A"), Person("B"))
        //when, then
        assertThat(people).extracting("name").containsExactlyInAnyOrder("B", "A")
    }

    @Test
    fun divideError(){
        //given
        val calculator = Calculator(5)

        //when, then
        assertThrows<IllegalArgumentException> {
            calculator.divide(0)
        }.apply{
            assertThat(message).isEqualTo("0으로 나눌 수 없습니다.")
        }
    }
}