package com.coding.test.programmers.level2

import java.util.*


class LevelV2Coding {
    /**
     * 최댓값과 최솟값
     */
    fun MaximumAndMinimumValues(s: String): String {
        val num = s.split(" ").map { it.toInt() }
        return num.minOf { it }.toString() + " " + num.maxOf { it }.toString()
    }

    /**
     * JadenCase 문자열 만들기
     */
    fun JadenCase(s: String): String {
        return s.lowercase().split(" ").map {
            it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }.joinToString(" ")
    }

    /**
     * 이진 변환 반복하기
     */
    fun RepeatBinaryConversion(s: String): IntArray {
        var binaryStr = s
        var zeroNumCount = 0
        var conversionCount = 0

        while (binaryStr != "1"){
            conversionCount++
            zeroNumCount += binaryStr.count{ it == '0' }
            // toString(redix: Int)에 Int형 데이터 타입을 넣으면 진법변환이 이루어진다.
            binaryStr = binaryStr.filterNot { it == '0' }.length.toString(2)
        }

        return intArrayOf(conversionCount, zeroNumCount)
    }

}