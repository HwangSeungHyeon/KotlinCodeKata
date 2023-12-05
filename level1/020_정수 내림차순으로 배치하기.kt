// https://school.programmers.co.kr/learn/courses/30/lessons/12933
// 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

// 내 첫번째 풀이
// class Solution {
//     fun solution(n: Long): Long {
//         var mylist = mutableListOf<Long>()
//         var tmp = n
//         var mystr = ""

//         while(tmp>0){
//             mylist.add(tmp%10)
//             tmp /= 10
//         }
//         mylist.sort()
//         mylist.reverse()

//         for(i in mylist){
//             mystr += i.toString()
//         }
//         return mystr.toLong()
//     }
// }

// 수정한 풀이
class Solution {
    fun solution(n: Long): Long {
        var str = n.toString() //스트링으로 변환
        var s = str.toCharArray() //캐릭터 배열로 변환

        s.sort() //정렬 (작은 숫자부터 시작해서 큰 숫자 순으로 정렬됨)
        s.reverse() //역순으로 정렬 (큰 숫자부터 시작해서 작은 숫자 순으로 정렬됨)
        
        var tmp = s.joinToString("") //char 배열 합쳐서 문자열 만들기
        var result = tmp.toLong() //string을 long타입으로 변환
        return result
    }
}