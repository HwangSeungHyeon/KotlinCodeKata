//https://school.programmers.co.kr/learn/courses/30/lessons/12954
//함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.


class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = mutableListOf<Long>() //먼저 수정 가능한 Long 타입 리스트 선언

        for(i in 1..n){
            answer.add(x.toLong()*i) //Long 타입 배열에 넣기 위해 x를 Long으로 변경
        }
        return answer.toLongArray() //수정가능한 리스트에서 수정 불가능한 배열로 변경한다.
    }
}