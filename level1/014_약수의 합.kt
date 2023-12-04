// https://school.programmers.co.kr/learn/courses/30/lessons/12928
// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        for(i in 1..n){
            // n%i가 0이면 약수임
            if(n%i == 0){
                answer += i
            }
        }
        return answer
    }
}