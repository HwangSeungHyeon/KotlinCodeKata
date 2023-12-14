// https://school.programmers.co.kr/learn/courses/30/lessons/12903
// 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

class Solution {
    fun solution(s: String): String {
        var answer = ""
        var strLen = s.length
        var strLenHalf = strLen/2
        
        if(strLen%2==0){ // 단어 길이가 짝수일 경우
            answer += s[strLenHalf-1].toString() + s[strLenHalf]
        }
        else{ //단어 길이가 홀수일 경우
            answer += s[strLenHalf].toString()
        }
        
        return answer
    }
}