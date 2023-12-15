// https://school.programmers.co.kr/learn/courses/30/lessons/12932#
// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

class Solution {
    fun solution(n: Long): LongArray {
        var tmp = n //n은 수정할 수 없는 변수이므로 따로 선언
        var answer = mutableListOf<Long>()   //  수정 가능한 리스트

        while(tmp > 0){ //n의 1의 자리까지 구하기 위해서 반복문 사용
            answer.add(tmp%10) //리스트에 10으로 나눈 나머지를 추가
            tmp = tmp / 10 //tmp에 들어있는 값을 10으로 나눠줌
        }
        return answer.toLongArray()
    }
}