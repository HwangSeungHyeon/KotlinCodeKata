//https://school.programmers.co.kr/learn/courses/30/lessons/133502
class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        var sb = StringBuilder()
        
        for(i in ingredient){
            sb.append(i) //기존 문자열처럼 새로운 객체를 생성하지 않고, sb의 값을 수정함
            
            if(sb.length >= 4){
                if(sb.substring(sb.length-4 until sb.length) == "1231"){ //문자열 뒤에서부터 확인
                    answer++
                    sb.delete(sb.length-4, sb.length) //확인했으면 지우기
                }
            }
        }
        return answer
    }
}