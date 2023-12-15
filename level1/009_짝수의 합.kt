// https://school.programmers.co.kr/learn/courses/30/lessons/120831
// 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

class Solution {
    //(0..n) => 0에서 n까지 범위 지정
    //filter{it%2==0} => 0에서 n까지 숫자 중 짝수만 가져옴
    //sum() => 가져온 짝수를 모두 더함
    fun solution(n: Int) = (0..n).filter{it % 2 == 0}.sum()
}