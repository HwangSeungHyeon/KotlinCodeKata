// https://school.programmers.co.kr/learn/courses/30/lessons/12934
// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

import kotlin.math.sqrt
class Solution {
    fun solution(n: Long): Long {
        var sq = sqrt(n.toDouble()) // 제곱근 구하기
        var longSq = sq.toLong() // double에서 long으로 타입 변환

        if(longSq*longSq == n){ // n이 x의 제곱일 경우
            var longSq1 = longSq + 1 // +1을 해줌
            var result = longSq1*longSq1 // +1을 해준 값의 제곱    
            return result
        }
        return -1 // 아닐 경우 -1 반환
    }
}