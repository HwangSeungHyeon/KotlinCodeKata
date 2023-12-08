//https://school.programmers.co.kr/learn/courses/30/lessons/12918
//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        var len = s.length
        
        if(len != 4 && len != 6) return false //길이가 4랑 6이 아닐 때는 상대도 안 함
        
        try{
            var tmp = s.toInt() //에러가 없다면 answer는 그대로 true임

        }catch(e:Exception){
            answer = false //에러가 있다면 answer는 false임
        }
        return answer
    }
}