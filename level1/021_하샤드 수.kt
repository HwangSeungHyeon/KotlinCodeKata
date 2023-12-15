// https://school.programmers.co.kr/learn/courses/30/lessons/12947
// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
// 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
// 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var sum : Int = 0 //자릿수의 합
        var tmp = x

        while(tmp > 0){
            sum += tmp%10
            tmp /= 10
        }
        if(x%sum!=0){  //x가 자릿수의 합이 아닐 경우만 answer를 변경
            answer = false
        }
        return answer
    }
}