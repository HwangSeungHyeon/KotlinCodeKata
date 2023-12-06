//https://school.programmers.co.kr/learn/courses/30/lessons/86051


// 처음 풀이
// class Solution {
//     fun solution(numbers: IntArray): Int {
//         var numList = mutableListOf<Int>()
//         for(i in 0..9){
//             numList.add(i)
//         }

//         var sum = 0

//         for(num in numList){ //0에서 9까지의 숫자
//             if(num in numbers){ // numbers 배열에 0에서 9사이의 숫자가 있다면
//                 continue
//             }
//             else{ // numbers 배열에 0에서 9사이의 숫자가 없다면
//                 sum += num
//             }
//         }
//         return sum
//     }
// }

// 수정한 풀이
class Solution {
    fun solution(numbers: IntArray): Int {

        //0에서 9까지의 값을 가진 리스트 생성
        var numList = mutableListOf<Int>()
        for(i in 0..9){
            numList.add(i)
        }

        //0에서 9까지의 숫자 중 일부가 들어있는 정수배열의 원소를 가져옮
        for(num in numbers){
            if(numList.contains(num)){ // numList에 num이 들어있다면 (= numbers 배열에 0에서 9사이의 어떤 숫자가 있다면)
                numList.remove(num) // 그 숫자를 제외
            }
        }
        var sum = numList.sum() // numbers에 없는 숫자만 남아있으므로 전부 더함
        return sum
    }
}