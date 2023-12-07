// https://school.programmers.co.kr/learn/courses/30/lessons/12922
// 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

class Solution {
    fun solution(n: Int): String {
        var answer = ""
        for(i in 0..n-1){
            if(i%2 == 0) { // 짝수일 경우
                answer += "수"
            }
            else{ // 홀수일 경우
                answer += "박"
            }
        }
        return answer
    }
}