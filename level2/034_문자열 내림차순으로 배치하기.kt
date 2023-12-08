//https://school.programmers.co.kr/learn/courses/30/lessons/12917
/*문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다*/

class Solution {
    fun solution(s: String): String {
        
        var sList = s.split("") //문자열을 쪼갬
        var sortedList = sList.sorted().reversed() //문자별로 자른 배열을 역순으로 정렬
        var joinedList = sortedList.joinToString() //배열 내용 자체를 문자열로 만듦
        var answer = joinedList.replace(", ", "") //쓸모없는 값 제거함
        return answer
    }
}