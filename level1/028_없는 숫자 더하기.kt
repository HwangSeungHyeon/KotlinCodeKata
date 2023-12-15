//https://school.programmers.co.kr/learn/courses/30/lessons/86051

class Solution {
    // (0..9) : 0에서 9까지 범위 지정
    //filter{it in numbers} => numbers에 들어있지 않은 숫자만 가져옴
    //sum() => 가져온 숫자를 모두 더함
    fun solution(numbers: IntArray) = (0..9).filterNot{it in numbers}.sum()
}