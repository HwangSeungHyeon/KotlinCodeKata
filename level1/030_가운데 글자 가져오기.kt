// https://school.programmers.co.kr/learn/courses/30/lessons/12903
// 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

class Solution {
    fun solution(s: String): String{
        var half = s.length/2
        var answer = s[half].toString()
        if(s.length %2 == 0) answer = s[half-1] + answer
        return answer
    }
}