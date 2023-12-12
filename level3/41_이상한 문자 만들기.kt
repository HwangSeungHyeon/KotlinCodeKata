// https://school.programmers.co.kr/learn/courses/30/lessons/12930
/*문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요. */

class Solution {
    fun solution(s: String): String {
        var answer = ""
        var idx = 0
        
        for(c in s){
            if(c == ' '){ //공백 만났을 때는
                idx = 0 //단어별 인덱스 초기화
                answer += ' ' //공백 추가
                continue
            }
            
            if(idx%2==0){//짝수일 경우
                answer += c.toUpperCase() //대문자 추가
            }
            else{//홀수일 경우
                answer += c.toLowerCase() //소문자 추가
            }
            idx++
        }
        println(answer)
        return answer
    }
}