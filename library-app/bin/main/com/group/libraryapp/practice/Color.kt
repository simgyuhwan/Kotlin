package com.group.libraryapp.practice


enum class Color(val r:Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255,255,0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
    // when 을 식으로 사용
    fun getMnemonic(color: Color) =
            when(color){
                BLUE -> "Battle"
                ORANGE -> "OF"
                RED -> "Richard"
                YELLOW -> "York"
                GREEN -> "Gave"
                INDIGO -> "In"
                VIOLET -> "Vain"
            }

    // 값의 조합
    fun getWarmth(color: Color) = when(color){
        BLUE, ORANGE, RED -> "first"
        YELLOW, GREEN -> "second"
        INDIGO, VIOLET -> "third"
    }

    // when 식의 인자로 객체를 넣을 수 있다.
    // setOf 는 코틀린 포준 라이브러리로 매개변수를 Set 집합 객체로 만들어준다.
    fun mix(c1: Color, c2: Color) = when(setOf(c1, c2)){
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

    // when 에 setOf를 두면 메서드를 사용할 때마다 객체가 생성된다. 그러니
    // 인자를 없애 성능을 높일 수 있다. 다만 가독성을 떨어질 수 있다. 트레이드 오프프
    fun mxOptimized(c1 : Color, c2:Color) = when{
        (c1 == RED && c2 == YELLOW ||
                c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == YELLOW && c2 == BLUE ||
                c1 == BLUE && c2 == YELLOW) -> GREEN
        (c1 == BLUE && c2 == VIOLET ||
                c1 == VIOLET && c2 == BLUE) -> INDIGO
        else -> throw Exception("Dirty colir")
    }
}