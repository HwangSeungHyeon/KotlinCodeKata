//https://school.programmers.co.kr/learn/courses/30/lessons/68644
/*정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.*/

class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        for(i in numbers.indices){
            for(j in i+1 until numbers.size){
                answer += numbers[i]+numbers[j]
            }
        }
        
        return answer.distinct().sorted().toIntArray()
    }
}