// https://school.programmers.co.kr/learn/courses/30/lessons/12912
// 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
// 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

class Solution {
    fun solution(a: Int, b: Int) = if(b>a) (a.toLong()+b)*(b-a+1)/2 else (a.toLong()+b)*(a-b+1)/2
}