// https://school.programmers.co.kr/learn/courses/30/lessons/70128
/*길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)*/

class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var sum = 0
        for((idx, data) in a.withIndex()){ //b 배열도 접근하기 위해 withIndex 사용
            sum += data * b[idx] //같은 인덱스의 값을 곱한 후 sum에 더함
        }
        return sum
    }
}