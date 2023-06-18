package com.group.libraryapp

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class JunitTest {

    companion object{
        @BeforeAll
        @JvmStatic
        fun beforeAll(){
            println("모든 테스트 시작 전")
        }

        @AfterAll
        @JvmStatic
        fun afterAll(){
            println("모든 테스트 시작 후")
        }
    }

    @BeforeEach
    fun beforeEach(){
        println("각 테스트 시작전")
    }

    @AfterEach
    fun afterEach(){
        println("각 테스트 끝")
    }

    @Test
    fun test1() {
        println("test 1")
    }

    @Test
    fun test2(){
        println("test 2")
    }
}