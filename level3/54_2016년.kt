//https://school.programmers.co.kr/learn/courses/30/lessons/12901
/* 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT

입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.*/

import java.text.SimpleDateFormat

class Solution {
    fun solution(a: Int, b: Int): String {
        
        // 2016년 a월 b일을 Date 타입으로 바꿈
        var dateFormat = SimpleDateFormat("yyyy-MM-dd").parse("2016-${a}-${b}")
        
        // Date 타입을 String 타입으로 바꿈
        // 요일만 출력
        var answer = SimpleDateFormat("E").format(dateFormat)
        return answer.toUpperCase() //대문자로 바꿔줌
    }
}