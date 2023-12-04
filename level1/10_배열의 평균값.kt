//https://school.programmers.co.kr/learn/courses/30/lessons/120817
//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

// class Solution {
//     fun solution(numbers: IntArray): Double {
//         return numbers.average()
//     }
// }

//내가 푼 풀이
class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        for(n in numbers){
            answer += n
        }
        return answer/numbers.size
    }
}