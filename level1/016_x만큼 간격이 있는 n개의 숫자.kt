//https://school.programmers.co.kr/learn/courses/30/lessons/12954
//함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

class Solution {
    // LongArray() : 문자를 저장할 배열
    // n : 배열의 크기, 0부터 n-1까지 반복한다는 뜻
    // {(it+1)*x.toLong()} : 0부터 n-1까지의 범위에 속하는 it과 x를 곱한 값을 배열에 넣겠다는 뜻
    fun solution(x: Int, n: Int) = LongArray(n, {(it+1)*x.toLong()})
}