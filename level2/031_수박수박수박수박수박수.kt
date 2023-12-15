// https://school.programmers.co.kr/learn/courses/30/lessons/12922
// 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

class Solution {
    // String() : CharArray를 문자열로 바꾸기 위해서 사용
    // CharArray() : 문자를 저장할 배열
    // n : 배열의 크기, 0부터 n-1까지 반복한다는 뜻
    // {it -> if(it%2==0)'수' else '박'} : 0부터 n-1 사이의 어떤 수가 짝수면 '수' 홀수면 '박'을 배열에 저장하겠다는 뜻
    fun solution(n: Int) = String(CharArray(n, { it -> if(it%2==0)'수' else '박'}))
}