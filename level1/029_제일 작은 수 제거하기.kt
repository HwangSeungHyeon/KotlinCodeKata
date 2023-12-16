//https://school.programmers.co.kr/learn/courses/30/lessons/12935
//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

class Solution {
    fun solution(arr: IntArray): IntArray {
        var minimum = arr.minOf{it}
        var answer = arr.filterNot{ it == minimum }.toIntArray()
        
        if(answer.size == 0){
            answer += -1
        }

        return answer
    }
}

// 특정 케이스에서 매우 느린 방법
// class Solution {
// 	// arr은 val 변수이기 때문에 값을 추가할 수 없다.
//     // fun solution(arr: IntArray) = if(arr.size == 0) arr+=-1 else arr.filterNot{ it == minOf{it} }.toIntArray()
    
//     // 그러므로 새로운 배열을 만들어서 반환한다.
//     fun solution(arr: IntArray) = if(arr.size == 1) intArrayOf(-1) else arr.filterNot{ it == arr.minOf{it} }.toIntArray()
// }