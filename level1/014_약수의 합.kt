// https://school.programmers.co.kr/learn/courses/30/lessons/12928
// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

class Solution {
    //(1..n) => 1에서 n까지 범위 지정
    //filter{n%it==0} => n을 it(1에서 n까지의 어떤 수)으로 나눴을 때 나머지가 0인 숫자만 가져옴
    //sum() => 가져온 숫자를 모두 더함
    fun solution(n: Int) = (1..n).filter{ n%it==0 }.sum()
}