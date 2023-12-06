// https://school.programmers.co.kr/learn/courses/30/lessons/12948
// 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
// 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

// 처음 풀이
// class Solution {
//     fun solution(phone_number: String): String {
//         var str = "" //새로 만들 문자열
//         var lastIndex = phone_number.length-1 //마지막 인덱스
//         var lastFourIndex = lastIndex-3 //오른쪽에서 4번째까지는 멀쩡해야 됨

//         for(i in 0..lastFourIndex-1){ //처음부터 오른쪽기준 5번째까지
//             str = str + "*"
//         }
//         for(i in lastFourIndex..lastIndex){ //오른쪽 기준 4번째부터 오른쪽 끝까지
//             str = str + phone_number[i]
//         }
//         return str
//     }
// }

// 반복문 2번 안 돌도록 수정한 풀이
class Solution {
    fun solution(phone_number: String): String {
        var str = "" //새로 만들 문자열
        var lastIndex = phone_number.lastIndex //마지막 인덱스

        for((i, item) in phone_number.withIndex()){
            if(i<lastIndex-3){ //오른쪽에서 5번째 까지는
                str = str + "*" //*로 표시
            }
            else{ //오른쪽에서 4번째부터는
                str = str + phone_number[i] //원래 숫자로
            }
        }
        return str
    }
}